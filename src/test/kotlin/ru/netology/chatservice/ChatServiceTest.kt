package ru.netology.chatservice

import org.junit.Test

import org.junit.Assert.*
import ru.netology.data.Message

class ChatServiceTest {

    @Test
    fun sendMessage() {
        val message1 = Message(1, 2, "Привет")
        val message2 = Message(1, 2, "Как дела?")
        val service = ChatService()
        service.sendMessage(message1)
        service.sendMessage(message2)
    }

//    @Test
//    fun deleteMessage() {
//    }
//
//    @Test
//    fun deleteChat() {
//    }
//
//    @Test
//    fun getChats() {
//    }
//
//    @Test
//    fun getMessages() {
//    }
//
//    @Test
//    fun getUnreadChatsCount() {
//    }
}