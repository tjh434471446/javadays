package com.jiehao;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import com.jiehao.pratice.codewars.BattleField;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {
    public static void main(String[] args) {
        //String a = "aaaaa";
        //String b = "bbbb";
        //System.out.println(Lcs.lcs(a,b));
        System.out.print("here");
        int i = 1;
        int j = 1;
        for (;j<10;j++){
            if (j > 5){
                break;
            }
            if (j % 2 != 0){
                j += 3;
            }
            j -= 1;

        }
        System.out.println("i is "+ i +" j is "+j);
        BattleField.test();
        //DragonsCurve curve = new DragonsCurve();
        //System.out.println(curve.createCurve(1));
        //Conversion conversion = new Conversion();
        //conversion.test();
        //CountIPAddresses.test();
        //Snail.test();
        //webserviceTest();
        //JosephusSurvivor.test();
        //System.out.println(Arrays.toString(KPrimes.countKprimes(2,0,100)));

        //xmlTest();
        /*
        System.out.println("Hello World!");
        Problem6174 main = new Problem6174();
        main.test();
        */

        /*
        HumanReadableTime humanReadableTime = new HumanReadableTime();
        humanReadableTime.test();
        */
        /*
        String test = Mixing.mix("Are they here","yes, they are here");
        System.out.println(test);
        System.out.println(Mixing.makeResult(test));

        String test2 = Mixing.mix("A generation must confront the looming","codewarrs");
        System.out.println(test2);
        System.out.println(Mixing.makeResult(test2));
        */
    }

    public static void xmlTest(String s)
    {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            InputStream in = new ByteArrayInputStream(s.getBytes());
            Document doc =  builder.parse(in);
            Element root = doc.getDocumentElement();
            if (root == null) return;
            //System.err.println(root.getTagName());
            NodeList nodes = root.getChildNodes();
            if (nodes == null) return;
            //System.out.println(nodes.getLength());
            for (int i = 0;i < nodes.getLength();i++)
            {
                Node node = nodes.item(i);
                //System.out.println(node.getNodeName());
                System.out.println(node.getNodeName() + " :" + node.getNodeValue());
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
    public static void webserviceTest() {
        /*
        String methodName = "noticeMessage";
        String inputXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<xml>\n" +
                "\t<request_char_set>UTF-8</request_char_set>\n" +
                "\t<request_version>1_0_0</request_version>\n" +
                "\t<method_name>noticeMessage</method_name>\n" +
                "\t<Request>\n" +
                "\t\t<consume_type>11</consume_type>\n" +
                "\t\t<hisOrderId>11981</hisOrderId>\n" +
                "\t\t<order_handle_time>20180326120946</order_handle_time>\n" +
                "\t\t<order_money>19.0</order_money>\n" +
                "\t\t<consume_content>\n" +
                "\t\t\t<akc190>100000006234641</akc190>\n" +
                "\t\t\t<yka103>100000004018862</yka103>\n" +
                "\t\t\t<aka130>0201</aka130>\n" +
                "\t\t\t<ykd007>1</ykd007>\n" +
                "\t\t\t<nums>2</nums>\n" +
                "\t\t\t<aac001>900000030</aac001>\n" +
                "\t\t\t<akb020>091001</akb020>\n" +
                "\t\t\t<aae011>app</aae011>\n" +
                "\t\t\t<aae036>2018-03-26 11:58:56</aae036>\n" +
                "\t\t\t<yka055>42</yka055>\n" +
                "\t\t\t<yka056>19.00</yka056>\n" +
                "\t\t\t<yka111>23.00</yka111>\n" +
                "\t\t\t<yka057>0.00</yka057>\n" +
                "\t\t\t<ykc177>7362.31</ykc177>\n" +
                "\t\t\t<yka107>0</yka107>\n" +
                "\t\t\t<yka065>23.00</yka065>\n" +
                "\t\t\t<ykh012>0.00</ykh012>\n" +
                "\t\t\t<yab003>0090</yab003>\n" +
                "\t\t\t<fymxdataset>\n" +
                "\t\t\t\t<row>\n" +
                "\t\t\t\t\t<yka105>4937305||1||1</yka105>\n" +
                "\t\t\t\t\t<yka299>23</yka299>\n" +
                "\t\t\t\t\t<yka096>0</yka096>\n" +
                "\t\t\t\t\t<yka056>0</yka056>\n" +
                "\t\t\t\t\t<yka057>0</yka057>\n" +
                "\t\t\t\t\t<yka111>23</yka111>\n" +
                "\t\t\t\t\t<yke011>0</yke011>\n" +
                "\t\t\t\t</row>\n" +
                "\t\t\t</fymxdataset>\n" +
                "\t\t\t<grzhye>\n" +
                "\t\t\t\t<row>\n" +
                "\t\t\t\t\t<ykc303>省医保参保人员</ykc303>\n" +
                "\t\t\t\t\t<ykc194>7362.31</ykc194>\n" +
                "\t\t\t\t</row>\n" +
                "\t\t\t</grzhye>\n" +
                "\t\t\t<ts/>\n" +
                "\t\t\t<dataset>\n" +
                "\t\t\t\t<row>\n" +
                "\t\t\t\t\t<yab139>0090</yab139>\n" +
                "\t\t\t\t\t<aka213>0101</aka213>\n" +
                "\t\t\t\t\t<yka115>0.00</yka115>\n" +
                "\t\t\t\t\t<yka058>0.00</yka058>\n" +
                "\t\t\t\t\t<ykc125>0.0000</ykc125>\n" +
                "\t\t\t\t\t<yka107>0.00</yka107>\n" +
                "\t\t\t\t\t<yka065>42.00</yka065>\n" +
                "\t\t\t\t\t<ykc121>0101</ykc121>\n" +
                "\t\t\t\t\t<ykb037>0090</ykb037>\n" +
                "\t\t\t\t\t<yka054>1</yka054>\n" +
                "\t\t\t\t\t<yka316>21</yka316>\n" +
                "\t\t\t\t\t<yka027/>\n" +
                "\t\t\t\t\t<yka026/>\n" +
                "\t\t\t\t</row>\n" +
                "\t\t\t</dataset>\n" +
                "\t\t</consume_content>\n" +
                "\t\t<trade_sn>180326030010011565220</trade_sn>\n" +
                "\t\t<order_pay_result>SUCCESS</order_pay_result>\n" +
                "\t</Request>\n" +
                "\t<request_source>SICHUAN_YBAPP</request_source>\n" +
                "</xml>";
                */
        String methodName = "getItemsInsurancePaymentMz";
        String inputXml = "<xml><method_name></method_name><request_char_set></request_char_set><request_version></request_version><request_source></request_source><Request><aac002>510103195611172811</aac002><aac003>赵海珠</aac003><aka130></aka130></Request></xml>";
//        String inputXml = "<?xml version="1.0" encoding="UTF-8"?><xml><request_char_set>UTF-8</request_char_set><request_version>1_0_0</request_version><method_name>getProcessResult</method_name><Request><hisOrderId>11969</hisOrderId><query_type>11</query_type></Request><request_source>SICHUAN_YBAPP</request_source></xml>";
//        String methodName = "getProcessResult";
        webserviceProcess(methodName,inputXml);
    }

    public static void webserviceProcess(String methodName,String inputXml)
    {
        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client = clientFactory.createClient("http://172.22.252.35/csp/huaxi/Huaxi.INSU.BS.MobileINSUService.CLS?WSDL=1");
        try {
            Object[] result = client.invoke(methodName,inputXml);
            System.out.println(result[0].toString());
            xmlTest(result[0].toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
