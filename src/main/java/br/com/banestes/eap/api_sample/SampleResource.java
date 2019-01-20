package br.com.banestes.eap.api_sample;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.ejb3.annotation.SecurityDomain;

@Path("/")
public class SampleResource {
    @Inject
    SampleService sampleService;

    @GET
    @Path("/json")
    @Produces({"application/json"})
    public String getJSON() {
        return "{\"result\":\"" + sampleService.createMessage("World") + "\"}";
    }

    @GET
    @Path("/xml")
    @Produces({"application/xml"})
    public String getXML() {
        return "<xml><result>" + sampleService.createMessage("World") + "</result></xml>";
    }

}
