package yncrea.lab05.web.config;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.endpoint.EndpointImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import yncrea.lab05.contract.facade.CompanyWS;
import yncrea.lab05.web.service.impl.CompanyWSImpl;


@Configuration
@ComponentScan(basePackages = "yncrea.lab05.web.service.impl")
@ImportResource("classpath:META-INF/cxf/cxf.xml")
public class WSconfig implements WebMvcConfigurer {
    private Bus bus;
    private CompanyWS companyWS;
    private Endpoint bean;

    public WSconfig() {

    }

    public WSconfig(Bus bus, CompanyWS companyWS) {
        this.bus = bus;
        this.companyWS = companyWS;
        this.bean = new EndpointImpl(bus,companyWS);
        this.bean.

    }


}
