package gr.socialtl.core.server;

/**
 * Created by Panagiotis on 12/30/2015.
 */
import org.springframework.boot.context.embedded.*;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

//@Component
public class CustomizationBean implements EmbeddedServletContainerCustomizer {
//
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        try {
            byte[] ipAddr = new byte[]{0, 0, 0, 0};
            InetAddress addr = InetAddress.getByAddress(ipAddr);
            container.setAddress(addr);
//            container.
            System.out.println("Setting Ip address");
        }catch (UnknownHostException ex){
            System.out.println("Ipaddress was not found");
        }
    }

}