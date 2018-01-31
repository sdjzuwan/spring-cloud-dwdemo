package com.dareway.dso;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class JfsqDSO {

	/*  @Autowired
	  private JdbcTemplate jdbc_template;*/
	  
	  
	  @RequestMapping("/hello")
      @ResponseBody
      public String hello() throws Exception{
          return "appid：sl-service；service-name：HelloService；operation-name：hello!";
      }
	  
	  @RequestMapping(value = "/save_jfsq")
      @ResponseBody
      public String save_jfsq(@RequestParam String para)  {
		  
		  /* JSONObject paraobj = new JSONObject(para);
		  
		  String cplx, qymc, gsjg, jfms, jffqr, sxqbz, jfzje, grjfje, qyjfje, ggzhjfje, sqzrs, piid, jflsh, qydm, jbr, yjfrq , bqjfqq ,bqjfzq;
		  cplx = paraobj.getString("cplx");
		  qymc = paraobj.getString("qymc");
		  gsjg = paraobj.getString("gsjg");
		  jfms = paraobj.getString("jfms");
		  jffqr = paraobj.getString("jffqr");
		  sxqbz = paraobj.getString("sxqbz");
		  yjfrq = paraobj.getString("yjfrq");
		  bqjfqq = paraobj.getString("bqjfqq");
		  bqjfzq = paraobj.getString("bqjfzq");
		  jfzje = paraobj.getString("jfzje");
		  grjfje = paraobj.getString("grjfje");
		  qyjfje = paraobj.getString("qyjfje");
		  ggzhjfje = paraobj.getString("ggzhjfje");
		  sqzrs = paraobj.getString("sqzrs");
		  piid = paraobj.getString("piid");
		  qydm = paraobj.getString("qydm");
		  jflsh = paraobj.getString("jflsh");
		  jbr = paraobj.getString("jbr");
		  
		  
		  StringBuffer sqlBF = new StringBuffer();
		  sqlBF.setLength(0);
		  sqlBF.append("update si0001.zgrs_poc set                  ");
		  sqlBF.append("  cplx = '"+ cplx +"',             ");
		  sqlBF.append("  qymc = '"+ qymc +"',            ");
		  sqlBF.append("   gsjg = '"+ gsjg  +"',            ");
		  sqlBF.append("   jfms = '"+ jfms +"',           ");
		  sqlBF.append("   jffqr = '"+jffqr  +"',            ");
		  sqlBF.append("   yjfrq = to_date('"+ yjfrq +"','yyyy-mm-dd'),      ");
		  sqlBF.append("   sxqbz = '"+ sxqbz +"',      ");
		  sqlBF.append("    bqjfqq = to_date('"+ bqjfqq +"','yyyy-mm-dd'),     ");
		  sqlBF.append("    bqjfzq = to_date('"+ bqjfzq +"','yyyy-mm-dd'),    ");
		  sqlBF.append("    jfzje = '"+ jfzje +"',      ");
		  sqlBF.append("    grjfje = '"+ grjfje +"',         ");
		  sqlBF.append("    qyjfje = '"+ qyjfje +"',           ");
		  sqlBF.append("    ggzhjfje = '"+ ggzhjfje +"',           ");
		  sqlBF.append("    sqzrs = '"+sqzrs +"',          ");
		  sqlBF.append("    jflsh= '"+ jflsh +"',          ");
		  sqlBF.append("    qydm ='"+ qydm  +"',           ");
		  sqlBF.append("    jbr = '"+ jbr +"',          ");
		  sqlBF.append("    jbsj = sysdate          ");
		  sqlBF.append("  where piid = '"+ piid +"'                            ");
		  
		  jdbc_template.execute(sqlBF.toString());*/
		  
		  SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		  String dateStr = sdf.format(new Date());
		  
		  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+dateStr+"：jssq-service:save_jfsq");
		  
		  return "success！return:保存缴费申请成功！";
      }
	  
	  @RequestMapping(value = "/get_jfsq_info")
      @ResponseBody
      public String get_jfsq_info(@RequestParam String para)  {
		  
		  /*JSONObject paraobj = new JSONObject(para);
		  
		  String piid = paraobj.getString("piid");
		  
		  StringBuffer sqlBF = new StringBuffer();
		  sqlBF.setLength(0);
		  sqlBF.append("select nvl(a.cplx, '') cplx,  nvl(a.qymc, '') qymc,  nvl(a.gsjg, '') gsjg,  nvl(a.jfms, '') jfms,  nvl(a.jffqr, '') jffqr,      ");
		  sqlBF.append("       a.yjfrq,  nvl(a.sxqbz, '') sxqbz, a.bqjfqq, a.bqjfzq, nvl(a.jfzje,0) jfzje,");
		  sqlBF.append("       nvl(a.grjfje,0) grjfje, nvl(a.qyjfje,0) qyjfje, nvl(a.qyjfje,0) qyjfje,  nvl(a.sqzrs, '') sqzrs,  nvl(a.jflsh, '') jflsh,   ");
		  sqlBF.append("       nvl( a.qydm, '') qydm,  nvl(a.jhh, '') jhh,  nvl(a.wthth, '') wthth,  nvl(a.jbr, '') jbr,  a.jbsj, sysdate qrsj,  nvl(a.jfzt, '') jfzt       ");
		  sqlBF.append("  from si0001.zgrs_poc a                             ");
		  sqlBF.append("  where piid = '"+ piid +"'                            ");
		  
		  List result_list = jdbc_template.queryForList(sqlBF.toString());
		  
		  if(result_list==null || result_list.size()==0) {
			  return "";
		  }
		  
		  JSONObject jobj = this.list2jobj(result_list);*/
		  
		  
		  SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		  String dateStr = sdf.format(new Date());
		  
		  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+dateStr+"：jssq-service:get_jfsq_info");
		  
		  return "success！return:qymc=xxx单位！";
      }
	  
	 /* private JSONObject list2jobj(List para_list) throws JSONException {
		  JSONObject jobj = new JSONObject();
		  if(para_list==null || para_list.size()==0) {
			  return jobj;
		  }
		  Map<String, Object> pmap = (Map<String, Object>) para_list.get(0);
		  Iterator<String> keyset = pmap.keySet().iterator();
		  while(keyset.hasNext()) {
			  String key = keyset.next();
			  Object value = pmap.get(key);
			  if(value==null) {
				  value = "";
			  }
			  jobj.put(key, value);
		  }
		  return jobj;
	  }*/
	
}
