back-end Java spring microservices project about an ecommerce application that handles orders related to products

services: 

    product-service: 

    used to atomically handle the CRUD operations and MongoDB setup for products
    
    order-service:

    used to atomically handle the CRUD operations, MongoDB setup and for orders and order items

    inventory-service:

    service used for CRUD handling the inventory with barcodes

    notification-service:

    service used for CRUD handling the notifications received related to movements with the order
    
https://spring.io/guides/gs/maven/
https://docs.spring.io/spring-framework/reference/index.html
https://spring.io/projects/spring-kafka
https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html
https://spring.io/blog/2016/02/15/distributed-tracing-with-spring-cloud-sleuth-and-spring-cloud-zipkin
