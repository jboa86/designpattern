package study.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyMain {

	public static void main(String[] args) {
//        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
//        Image image2 = new ProxyImage("HiRes_10MB_Photo2");     
//
//        image1.displayImage(); // loading necessary
//        image2.displayImage(); // loading necessary
		
		
		 List<Image> images = new ArrayList<Image>();

         images.add(new ProxyImage("HiRes_10MB_Photo1"));

         images.add(new ProxyImage("HiRes_10MB_Photo2"));

         images.add(new ProxyImage("HiRes_10MB_Photo3"));


        images.get(0).displayImage(); // Loading이 필요합니다.

         images.get(1).displayImage(); // Loading이 필요합니다.

         images.get(0).displayImage(); // Loading이 필요하지 않습니다.

    }



/*
 * List<Image> images = new ArrayList<Image>();

             images.add(new ProxyImage("HiRes_10MB_Photo1"));

             images.add(new ProxyImage("HiRes_10MB_Photo2"));

             images.add(new ProxyImage("HiRes_10MB_Photo3"));

 

            images.get(0).displayImage(); // Loading이 필요합니다.

             images.get(1).displayImage(); // Loading이 필요합니다.

             images.get(0).displayImage(); // Loading이 필요하지 않습니다.

             //세번째 displayImage() 메소드에 대해서는 따로 객체를 생성하지 않습니다.

 * 
 * */
}
