package org.noka.function;

import org.noka.constvar.ConstVar;
import org.nokatag.system.ServletNokaContext;

/**
 * 语言选择
 * @author xiefangjian
 *
 */
public class LanguageRead {
	public static String getLang(String key){
		String bstr = null;
		try{
			bstr = ConstVar.LANGUAGES_STR.get(ServletNokaContext.getRequest().getAttribute("syslanuage")).get(key);
		}catch(Exception se){
		}
		if(bstr==null)
			bstr = "NoFind";
		return bstr;
	}
	public static String getLang(String mark,String key){
		String bstr = null;
		try{
			bstr = ConstVar.LANGUAGES_STR.get(mark).get(key);
		}catch(Exception se){
		}
		if(bstr==null)
			bstr = "NoFind";
		return bstr;
	}
}