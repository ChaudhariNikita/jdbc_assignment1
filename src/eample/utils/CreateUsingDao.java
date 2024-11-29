package eample.utils;

import example.bean.Article;
import example.dao.DaoInterface;
import example.dao.*;

public class CreateUsingDao {
	public static void main(String[] args) {
		DaoInterface<Article,Integer> daoRef=new ArticleDao();
		Article at=new Article(4, "nikita", "painting","2024-11-28","chaudhari");
 	     daoRef.Create(at);

	}
}
