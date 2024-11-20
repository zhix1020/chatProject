package com.example.demo.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Chat;

@SpringBootTest
public class ChatTest {
	@Autowired
	ChatMapper chatmapper;
	
	//@Test
	public void ctest()
	{
		
		//System.out.println(chatmapper.selectAll());
		//chatmapper.addChat(new Chat("tt","ss","tt"));
		//System.out.println(chatmapper.selectById(6));
		System.out.println(chatmapper.selectByIdRange(1, 5));
		System.out.println("success");
	}
	//@Test
			public void updateTest()
			{
				List<Chat> l=chatmapper.selectById(14);
				Chat m=l.get(0);
				
				m.setName("teacher");
				m.setSubject("FFF");
				m.setContent("JJJJJ");
				
				chatmapper.update(m);
				System.out.println("update success");
			}
			
			@Test
			public void deletetest()
			{
				chatmapper.deleteById(14);
				System.out.println("delete success");
			}
}