package com.training.javaee.teb.rest;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.training.javaee.teb.ejb.MyStatefulEJB;
import com.training.javaee.teb.ejb.MyStatelessEJB;
import com.training.javaee.teb.rest.employee.models.Employee;


@ApplicationScoped
// Mapping 1 (optional) ---> Use @Path
@Path("/hello")
@Produces({
            "application/json"
})
@Consumes({
            "application/json"
})
public class HelloRest implements Serializable {

    @EJB
    private MyStatelessEJB myStatelessEJB;

    @EJB
    private MyStatefulEJB  myStatefulEJB;


    public HelloRest() {
        System.out.println("HelloRest Yaratıldı !!!!!!!!!!!!");
    }

    @Path("/show/stateless")
    @GET
    @Produces({
                "text/plain"
    })
    public String showCount() {
        this.myStatelessEJB.doFirst(10);
        this.myStatelessEJB.doLast(1);
        return "OK";
    }

    @Path("/show/stateful")
    @GET
    @Produces({
                "text/plain"
    })
    public String showCountStateful() {
        this.myStatefulEJB.doFirst(10);
        this.myStatefulEJB.doLast(1);
        this.myStatefulEJB.doLast(1);
        this.myStatefulEJB.doLast(1);
        this.myStatefulEJB.doLast(1);
        return "Counter : " + this.myStatefulEJB.getCounter();
    }


    // Mapping 2 (mandatory) ---> @Path (optional) ve use Http method annotations
    @Path("/greet1")
    @GET
    @Produces({
                "text/plain"
    })
    public String xyz() {
        return "Hello world";
    }

    @Path("/greet2")
    @GET
    @Produces({
                "text/plain"
    })
    // Mapping 3 mandatory -->
    // /tebee/rest/hello/greet2?isim=osman&soy=yaycıoğlu
    public String hello2(@QueryParam("isim") final String name,
                         @QueryParam("soy") final String surname) {
        return "Hello " + name + " " + surname;
    }

    @Path("/greet3/{xyz}/{abc}")
    @GET
    @Produces({
                "text/plain"
    })
    // /tebee/rest/hello/greet3/osman/yaycıoğlu
    public String hello3(@PathParam("xyz") final String name,
                         @PathParam("abc") final String surname) {
        return "Hello " + name + " " + surname;
    }

    @Path("/greet4/{xyz}")
    @GET
    @Produces({
                "text/plain"
    })
    // /tebee/rest/hello/greet3/osman?soy=yaycıoğlu
    public String hello4(@PathParam("xyz") final String name,
                         @QueryParam("soy") final String surname) {
        return "Hello " + name + " " + surname;
    }

    @Path("/greet5")
    @POST
    @Produces({
                "text/plain"
    })
    @Consumes({
                "application/json"
    })
    // /tebee/rest/hello/greet5 <--- url / body >>> JSON
    public String hello4(final Employee employeeParam) {
        return "Hello "
               + employeeParam.getName()
               + " "
               + employeeParam.getSurname()
               + " "
               + employeeParam.getAge()
               + " height : "
               + employeeParam.getHeight();
    }


    @Path("/greet6")
    @POST
    // /tebee/rest/hello/greet6 <--- url / body >>> JSON
    public Person hello6(final Employee employeeParam) {
        return Person.createPerson()
                     .setName(employeeParam.getName())
                     .setSurname(employeeParam.getSurname())
                     .setHeight(employeeParam.getHeight());
    }


    @Path("/greet7")
    @GET
    @Produces({
                "text/plain"
    })
    // /tebee/rest/hello/greet3/osman?soy=yaycıoğlu
    public String hello7(@HeaderParam("isim") final String name,
                         @HeaderParam("soy") final String surname) {
        return "Hello " + name + " " + surname;
    }

    @Path("/greet8")
    @POST
    @Produces({
                "text/plain"
    })
    @Consumes("application/x-www-form-urlencoded")
    // /tebee/rest/hello/greet3/osman?soy=yaycıoğlu
    public String hello8(@FormParam("isim") final String name,
                         @FormParam("soy") final String surname) {
        return "Hello " + name + " " + surname;
    }

    @Path("/greet9")
    @POST
    @Produces({
                "text/plain"
    })
    // /tebee/rest/hello/greet3/osman?soy=yaycıoğlu
    public String hello9(@MatrixParam("isim") final String name,
                         @MatrixParam("soy") final String surname) {
        return "Hello " + name + " " + surname;
    }


    @Path("/greet10")
    @POST
    @Produces({
                "text/plain"
    })
    // /tebee/rest/hello/greet5 <--- url / body >>> JSON
    public String hello10(@BeanParam final Employee2 employeeParam) {
        return "Hello "
               + employeeParam.getName()
               + " "
               + employeeParam.getSurname()
               + " "
               + employeeParam.getAge()
               + " height : "
               + employeeParam.getHeight();
    }

}
