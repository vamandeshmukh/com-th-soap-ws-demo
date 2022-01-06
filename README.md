# com-th-soap-ws-demo
 SOAP Spring bood demo 

run command 
curl --header "content-type: text/xml" -d @request.xml http://localhost:8099/ws 


request.xsd file 
----------------

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				  xmlns:gs="https://www.torryharris.com/soap-ws-demo">
   <soapenv:Header/>

   <soapenv:Body>
         <gs:getEmployeeRequest>
         <gs:employeeId>Sonu</gs:employeeId>
      </gs:getEmployeeRequest>
   </soapenv:Body>
   
</soapenv:Envelope>
