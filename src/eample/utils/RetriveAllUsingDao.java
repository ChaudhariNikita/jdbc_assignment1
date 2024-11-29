package eample.utils;

import java.util.Collection;

import example.bean.Article;
import example.dao.DaoInterface;
import example.dao.*;

public class RetriveAllUsingDao {
	public static void main(String[] args) {
		DaoInterface<Article,Integer> daoRef=new ArticleDao();
		Collection <Article> allavailablearticles=daoRef.retrieveAll();
		for (Article currentArticle:allavailablearticles)
			System.out.println(currentArticle);
	}
}
