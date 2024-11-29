package eample.utils;

import example.bean.Article;
import example.dao.DaoInterface;
import example.dao.*;

public class DeleteUsingDao {
	public static void main(String[] args) {
		DaoInterface<Article,Integer> daoRef=new ArticleDao();
		daoRef.delete(4);

	}
}
