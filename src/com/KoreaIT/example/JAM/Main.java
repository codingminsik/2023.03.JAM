package com.KoreaIT.example.JAM;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		List<Article> articles = new ArrayList<>();
		int lastArticleId = 0;
		
		while(true) {
			
			System.out.print("명령어 ) ");
			String cmd = sc.nextLine().trim();
		
			if(cmd.equals("exit")) {
				break;
			}
		
			if(cmd.equals("article write")) {
				System.out.println("게시글 작성");
				int id = lastArticleId + 1;
				System.out.print("제목 ) ");
				String title = sc.nextLine();
				System.out.print("내용 ) ");
				String body = sc.nextLine();
				
				Article article = new Article(id, title, body);
				articles.add(article);
				
				System.out.printf("%d번 게시물이 생성되었습니다.\n", id);
				lastArticleId++;
			} else if(cmd.equals("article list")) {
				System.out.println("게시글 목록");
				
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
