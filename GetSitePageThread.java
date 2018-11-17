package concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetSitePageThread extends Thread {
	
	private String url;
	private String contenuto;
	
	public GetSitePageThread(String url) {
		this.url=url;
	}
	
	@Override
	public void run() {
		try {
			URL u=new URL(url);
			URLConnection connettore=u.openConnection();
			InputStream is=connettore.getInputStream();
			setContenuto(Utils.getString(is));
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	
	

}
