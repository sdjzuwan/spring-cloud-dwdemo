package com.dareway.dso;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class JfrwDSO {
	
	  @Autowired
	  RestTemplate restTemplate;

	 /* @Autowired
	  private JdbcTemplate jdbc_template;*/
	  
	  
	  @RequestMapping("/hello")
      @ResponseBody
      public String hello() throws Exception{
          return "appid：sl-service；service-name：HelloService；operation-name：hello!";
      }
	  
	  @RequestMapping(value = "/save_jfrw")
      @ResponseBody
      public String save_jfrw(@RequestParam String para) {
		  
		  /* JSONObject paraobj = new JSONObject(para);
		  
		  String bz, piid;
		  bz = paraobj.getString("bz");
		  piid = paraobj.getString("piid");

		  StringBuffer sqlBF = new StringBuffer();
		  sqlBF.setLength(0);
		  sqlBF.append("update si0001.zgrs_poc set                  ");
		  sqlBF.append("  bz = '"+bz+"'                        ");
		  sqlBF.append("  where piid = '"+piid+"'                            ");
		  
		  jdbc_template.execute(sqlBF.toString());*/
		  
		  SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		  String dateStr = sdf.format(new Date());
		  
			
		  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+dateStr+"：jsrw-service:save_jfrw");
	
		  this.invokeJfsqService(para);
		  
		  return "success";
      }
	  
	//invokeJfsqService
    public void invokeJfsqService(String para) {
    	restTemplate.postForEntity("http://jfsq-service/get_jfsq_info?para={para}", para, String.class, para).getBody();
    }
	  
	
}
