package com.wangyuan.growing.demo.day5_23;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agfhsource implements Runnable{
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss");
    private  String path;
    private String fileName;
    private String newDir;
    private String oldDir;


    public Agfhsource(String path, String fileName, String newDir, String oldDir) {
        this.path = path;
        this.fileName = fileName;
        this.newDir = newDir;
        this.oldDir = oldDir;
    }

    public Agfhsource() {
    }


    /**
     * 从网络Url中下载文件
     * @param urlStr
     * @param fileName
     * @param savePath
     * @throws IOException
     */
    public static void  downLoadFromUrl(String urlStr,String fileName,String savePath) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3*1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

        //得到输入流
        InputStream inputStream = conn.getInputStream();
        //获取自己数组
        byte[] getData = readInputStream(inputStream);

        //文件保存位置
        File saveDir = new File(savePath);
        if(!saveDir.exists()){
            saveDir.mkdir();
        }
        File file = new File(saveDir+File.separator+fileName);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(getData);
        if(fos!=null){
            fos.close();
        }
        if(inputStream!=null){
            inputStream.close();
        }
        //System.out.println("info:"+url+" download success");

    }



    /**
     * 从输入流中获取字节数组
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }





    //可用
    //http://120.210.200.14:18080/PLTV/88888891/224/3221225677/10000100000000060000000000165256_0.smil/index.m3u8?fmt=ts2hls&servicetype=1
    //不通
    //http://120.210.200.14/PLTV/88888891/224/3221225677/10000100000000060000000000165256_0.smil/index.m3u8?fmt=ts2hls&servicetype=1
    @Override
    public void run() {
        while (true) {
            try{
                //System.out.println("path is "+path +"fileName is "+fileName+"newDir is "+newDir + " oldDir is"+oldDir );
                downLoadFromUrl(path, fileName,newDir);//+System.currentTimeMillis()
                Thread.sleep(50000);
                downLoadFromUrl(path, fileName,oldDir);//+System.currentTimeMillis()
                Thread.sleep(50000);
            }catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                System.out.println("download file error filePath="+path+" Date is "+format.format(new Date()));
            }
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getNewDir() {
        return newDir;
    }

    public void setNewDir(String newDir) {
        this.newDir = newDir;
    }

    public String getOldDir() {
        return oldDir;
    }

    public void setOldDir(String oldDir) {
        this.oldDir = oldDir;
    }

    ///usr/local/TS/
    public static void main(String[] args) {
		//(安广烽火)科教频道
        new Thread(new Agfhsource(
	"http://120.210.193.151:8006/120000001002/GDKJPD/index.m3u8","GDKEPD.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();

	
	//(安广烽火)公道频道
	new Thread(new Agfhsource(
        "http://120.210.193.151:8006/120000001002/GDGGPD/index.m3u8","GDGGPD.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();	

	//(安广烽火)经济生活
	new Thread(new Agfhsource(
        "http://120.210.193.151:8006/120000001002/GDJJSH/index.m3u8","GDJJSH.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();

	//(安广烽火)影视频道
	new Thread(new Agfhsource(
        "http://120.210.193.151:8006/120000001002/GDYSPD/index.m3u8","GDYSPD.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();

	//(安广烽火)综艺频道
	new Thread(new Agfhsource(
        "http://120.210.193.151:8006/120000001002/GDZYPD/index.m3u8","GDZYPD.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();
	
		
	//(安广华为)科教频道
	new Thread(new Agfhsource(
        "http://112.29.231.73:18080/PLTV/88888890/224/3221225711/10000100000000060000000000190744_0.smil/index.m3u8?fmt=ts2hls&servicetype=1","AGHWKJPD.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();
	
	//(安广华为)科教频道
	new Thread(new Agfhsource(
	"http://112.29.231.73:18080/PLTV/88888890/224/3221225709/10000100000000060000000000190746_0.smil/index.m3u8?fmt=ts2hls&servicetype=1","AGHWGGPD.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();
	
	//(安广华为)经济生活
	new Thread(new Agfhsource(
	"http://112.29.231.73:18080/PLTV/88888890/224/3221225713/10000100000000060000000000190742_0.smil/index.m3u8?fmt=ts2hls&servicetype=1","AGHWJJSHPD.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();
	
	//(安广华为)经济生活
	new Thread(new Agfhsource(
	"http://112.29.231.73:18080/PLTV/88888890/224/3221225712/10000100000000060000000000190743_0.smil/index.m3u8?fmt=ts2hls&servicetype=1","AGHWYSPD.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();	
	
	//(安广华为)经济生活
	new Thread(new Agfhsource(
	"http://112.29.231.73:18080/PLTV/88888890/224/3221225710/10000100000000060000000000190745_0.smil/index.m3u8?fmt=ts2hls&servicetype=1","AGHWZYPD.m3u8","/usr/local/AGFH/","/usr/local/agfh/")).start();
   
 }
}
