package com.dareway.dso;

import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JfspDSO {

	  /*@Autowired
	  private JdbcTemplate jdbc_template;*/
	  
	  
	  @RequestMapping("/hello")
      @ResponseBody
      public String hello() throws Exception{
          return "appid：sl-service；service-name：HelloService；operation-name：hello!";
      }
	  
	  @RequestMapping(value = "/save_jfsp")
      @ResponseBody
      public String save_jfsp(@RequestParam String para) throws JSONException {
		  
		 /* JSONObject paraobj = new JSONObject(para);
		  
		  String spjg, spyj, piid ;
		  spjg = paraobj.getString("spjg");
		  spyj = paraobj.getString("spyj");
		  piid = paraobj.getString("piid");
		  
		  StringBuffer sqlBF = new StringBuffer();
		  sqlBF.setLength(0);
		  sqlBF.append("insert into si0001.zgrs_spls         ");
		  sqlBF.append("  (piid, splx, spr, spjg, spyj, spsj)");
	      sqlBF.append("values                               ");
		  sqlBF.append("  ('"+piid+"', '01', '部长', '"+spjg+"', '"+spyj+"', sysdate)           ");
		  
		  jdbc_template.execute(sqlBF.toString());*/
		  
		  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>jssp-service:save_jfsp");
		  
		  return "success";
      }
	  
	  
	  
	
}
