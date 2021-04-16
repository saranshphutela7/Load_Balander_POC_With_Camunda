Prerequisites - 
1. Angular 10 or greater
2. JDK
3. Maven
4. IDE(s) for front-end and back-end

Steps to install - 
1. Extract the project(load-balancer.zip) zip folder which contains 4 microservices(in backend folder) and 1 angular app.
2. Import all 4 microservices which are in the backend folder into any appropriate IDE (Eclipse/STS preferred because microservices were built using that).
3. Run the Eureka-server-spring microservice (Port : 8762, If not changed)
4. Run the Camunda-Engine-A microservice (Port : 9090, If not changed)
5. Run the Camunda-Engine-B microservice (Port : 9091, If not changed)
6. Run the Ribbon-client-gateway microservice (Port : 8888, If not changed)
7. Go inside the PizzaApp folder and Run CMD over the same path.
7.a. Run the "npm install" command to Add the node-modules in the project.
7.b. If this doesn't work because of version miscompatibility (application being in angular 10). please use "npm install --force"
7.c. After successfully installing run "ng serve" command.
7.d. Application will start on localhost:4200

To Test the application -

o	Using Front End, Select any Pizza Type and Quantity, and click “Order” button which will trigger the Ribbon-client-gateway’s “/start” endpoint, which in turn, triggers Camunda’s Rest Endpoint to start a workflow instance
o	If you want to directly trigger the API, trigger the below endpoint –
	Method type: GET
	Method Endpoint: http://localhost:8888/start?key=OrderProcessing&pizzaType={pizzaType}&quantity={quantity}
	Response – True, if process Instance started successfully, otherwise false.

Now to check if the instance is getting started via engine a or engine b, A special variable has been added to Camunda’s process variables which shows which Engine was used to trigger the instance. (Please refer to the screenshot section in the document sent). Also, the same is logged at the console level.
