package eample.utils;

import example.bean.Article;
import example.dao.DaoInterface;
import example.dao.*;

public class UpdateUsingDao {
	public static void main(String[] args) {
		DaoInterface<Article, Integer> daoRef = new ArticleDao();
		Article at = daoRef.retrieveOne(3);
		at.setName("nik");
		at.setCategory("sculpture");
		at.setDatecreated("2025-08-12");
		at.setCreatorName("nikki");
		daoRef.update(at);
	}
}
