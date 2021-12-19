package br.cooper.quarkus.a;

import java.text.ParseException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/cotacaoDiaria")
@Tag(name = "cotacaoDiaria")
public class CotacaoDiariaResource {

	public static final String FORMATO_JSON = "json";
	
    @Inject
    @RestClient
    CotacaoDiariaService cotService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/projetoA")
	@Operation(summary = "Retorna a cotacao do dia passado e do dia util anterior", description = "Retorna a cotacao do dia passado e do dia util anterior conforme parametro indicado")
	@APIResponse(responseCode = "200", description = "Sucesso", content = @Content(schema = @Schema(type = SchemaType.OBJECT, implementation = CotacaoDiaria.class)))
    @APIResponse(responseCode = "400", description = "Erro ao tentar acessar o serviço, verifique a rota", content = @Content(schema = @Schema(type = SchemaType.OBJECT, implementation = CotacaoDiaria.class)))
    @APIResponse(responseCode = "404", description = "Objeto não encontrado ", content = @Content(schema = @Schema(type = SchemaType.OBJECT, implementation = CotacaoDiaria.class)))
    @APIResponse(responseCode = "500", description = "Falha no processamento da requisição. ", content = @Content(schema = @Schema(type = SchemaType.OBJECT, implementation = CotacaoDiaria.class)))
    public CotacaoDiaria findCotacaoDia(@QueryParam("@dataCotacao") String dataCotacao) throws ParseException {
        return cotService.findCotacaoDia(dataCotacao, FORMATO_JSON);
    }
}