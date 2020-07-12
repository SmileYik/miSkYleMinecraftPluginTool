package com.github.miskyle.mcpt.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;

import com.github.miskyle.mcpt.server.Logger;

public class I18N {
	private static I18N 		  i18n;
	
	private        ResourceBundle custum;
	private final  ResourceBundle defual;
	
	public I18N(String language){
		defual = ResourceBundle.getBundle("lang/", Locale.CHINESE);
		try{
			custum = ResourceBundle.getBundle("lang/", new Locale(language));
		}catch (Exception e) {
			custum = null;
			Logger.logger.log(Level.WARNING,
					"»± ß”Ô—‘: "+language+"!  π”√ƒ¨»œ”Ô—‘: "+Locale.CHINESE);
		}
		i18n  = this;
	}
	
	private String tran(String key){
		if(key==null || key.isEmpty())return "";
		try {
			return custum.getString(key);
		} catch (Exception e) {
			try {
				return defual.getString(key);									
			} catch (Exception e3) {
				return "Missing Key: "+key+". Please Notification op.";
			}
		}
	}
	
	public static String tr(String key,Object ... objs){
		if(objs==null||objs.length==0)return i18n.tran(key);
		else return MessageFormat.format(i18n.tran(key), objs);
	}
	
	public static String tr(String key){
		return i18n.tran(key);
	}
}
