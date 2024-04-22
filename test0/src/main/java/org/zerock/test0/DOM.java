package org.zerock.test0;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DOM {
    public static void main(String[] args) {
        DTO dto=new DTO();
        try {
            // XML 파일을 파싱하여 DOM 객체 생성
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("test.xml");

            // 루트 요소 가져오기
            Element root = document.getDocumentElement();
            System.out.println("Root element: " + root.getNodeName());

            // 자식 요소들 탐색
            NodeList itemList = root.getElementsByTagName("item");
            for (int i = 0; i < itemList.getLength(); i++) {
                Element item = (Element) itemList.item(i);
                //String dutyName = item.getElementsByTagName("dutyName").item(0).getTextContent();
                //String dutyAddr = item.getElementsByTagName("dutyAddr").item(0).getTextContent();


            }
            System.out.println(dto.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
