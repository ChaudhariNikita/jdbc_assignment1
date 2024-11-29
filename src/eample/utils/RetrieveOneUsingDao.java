package eample.utils;

import example.dao.DaoInterface;
import example.bean.Article;
import example.dao.*;

public class RetrieveOneUsingDao {
	public static void main(String[] args) {
		DaoInterface<Article,Integer> daoRef=new ArticleDao();
		Article Articleobj=daoRef.retrieveOne(3);
		 if(Articleobj!=null)
  		   System.out.println(Articleobj);
  	   else
  		   System.out.println("Article with given Key does not exist");
	}
}
