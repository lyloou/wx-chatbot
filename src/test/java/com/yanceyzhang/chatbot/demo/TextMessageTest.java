package com.yanceyzhang.chatbot.demo;

import com.yanceyzhang.commons.wx.chatbot.SendResult;
import com.yanceyzhang.commons.wx.chatbot.WxChatbotClient;
import com.yanceyzhang.commons.wx.chatbot.message.TextMessage;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class TextMessageTest {


    @Test
    public void testSendTextMessageWithAtAndAtAll() throws Exception {
        TextMessage message = new TextMessage("嘿~");
        List<String> mentionedMobileList = new ArrayList<String>();
        mentionedMobileList.add("1529083XXXX");//@群内成员  手机号
        message.setMentionedMobileList(mentionedMobileList);
        message.setIsAtAll(true);//@所有人
        SendResult result = WxChatbotClient.send(TestConfig.CHATBOT_WEBHOOK, message);
        System.out.println(result);
    }
}