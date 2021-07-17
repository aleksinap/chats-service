package ru.netology

import ru.netology.chatservice.ChatService
import ru.netology.data.Message

fun main() {

    val message1 = Message(1, 2, "Привет")
    val message2 = Message(1, 2, "Как дела?")
    val message3 = Message(2, 1, "Нормально")
    val message4 = Message(2, 1, "А у тебя?")
    val message5 = Message(1, 2, "Тоже норм")
    val message6 = Message(1, 3, "Здравствуйте")
    val message7 = Message(1, 3, "Я от Димы по поводу работы")
    val message8 = Message(3, 1, "Здравствуйте")

    val service = ChatService()

    service.sendMessage(message1)
    service.sendMessage(message2)
//    service.getUnreadChatsCount(1).also(::println)
//       println("Chats for user with id = 2: " + service.getChats(2))
//       service.getMessages(2,1)
//       service.getUnreadChatsCount(2).also(::println)
//       println("Chats for user with id = 2: " + service.getChats(2))
//
    service.sendMessage(message3)
//    service.getUnreadChatsCount(1).also(::println)
////    service.getMessages(1,2)
    service.sendMessage(message4)
////    service.getMessages(1,2)
    service.sendMessage(message5)
    service.sendMessage(message6)
    service.sendMessage(message7)
////    service.getMessages(3,1)
    service.sendMessage(message8)
//    service.getUnreadChatsCount(1).also(::println)
//    println("Before deleting")
//    println("Chats for user with id = 1: " + service.getChats(1)
//    println("Chats for user with id = 2: " + service.getChats(2)
//    println("Chats for user with id = 3: " + service.getChats(3)

//    service.deleteMessage(1, 2, 1)
//    service.deleteMessage(1, 2, 2)
//    service.deleteMessage(1, 2, 3)
//    service.deleteMessage(1, 2, 4)
//    service.deleteMessage(1, 2, 5)
////    service.deleteMessage(1, 3, 6)
//
//    service.deleteChat(1, 2).also(::println)

//    service.getUnreadChatsCount(1).also(::println)
/*    service.getUnreadChatsCount(2).also(::println)
    service.getUnreadChatsCount(3).also(::println)*/
//    println("After deleting")
    println("Chats for user with id = 1: " + service.getChats(1))
    println("Chats for user with id = 2: " + service.getChats(2))
    println("Chats for user with id = 3: " + service.getChats(3))
    println("Messages for chat with id = 1: " + service.getMessages(1, 1, 3))
}