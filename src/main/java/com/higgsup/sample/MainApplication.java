package com.higgsup.sample;

import com.higgsup.sample.entites.PurchaseOrder;
import com.higgsup.sample.services.PurchaseOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * Created by tulh on 9/1/2017
 */
@Configuration
@EnableJpaRepositories("com.higgsup.sample.repositories")
public class MainApplication {
    private static final Logger logger = LoggerFactory.getLogger(MainApplication.class);
    public static void main(String[] args) {
        // Acquire Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        PurchaseOrderService purchaseOrderService = context.getBean(PurchaseOrderService.class);
        PurchaseOrder purchaseOrder = purchaseOrderService.findById("BW2017095347");
        if (purchaseOrder != null) {
            logger.info(purchaseOrder.toString());
        }
        // Close context
        context.close();
    }
}
