package br.cooper.quarkus.a;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/v1/odata")
@RegisterRestClient
public interface CotacaoDiariaService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("CotacaoDolarDia(dataCotacao=@dataCotacao)")
    public CotacaoDiaria findCotacaoDia(@QueryParam("@dataCotacao") String dataCotacao, @QueryParam("format") String format);
}