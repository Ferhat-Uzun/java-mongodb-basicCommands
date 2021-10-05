package com.bigdatacompany.mongodbent;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        MongoClient client = new MongoClient("localhost",27017);
        MongoDatabase infoDB = client.getDatabase("Info");
        MongoCollection<Document> personelCollection = infoDB.getCollection("Personel");

        BasicDBObject data = new BasicDBObject()
                .append("name","Thomas Edison")
                .append("date", 1847)
                .append("country" ,"United States");

        BasicDBObject data2 = new BasicDBObject()
                .append("name","Elon Musk")
                .append("date", 1971)
                .append("country" ,"South Africa")
                .append("job" ,"entrepreneur");

//        Document parse = Document.parse(data.toJson());
//        Document parse2 = Document.parse(data2.toJson());
//
//
//        personelCollection.insertMany(Arrays.asList(parse,parse2));


//        Document document1 = Document.parse(data.toJson());
//        Document document2 = Document.parse(data2.toJson());
//
//        personelCollection.insertMany(Arrays.asList(document1,document2));

//        FindIterable<Document> documents = personelCollection.find(new BasicDBObject("date" ,1942));
//
//        for (Document doc: documents){
//            System.out.println(doc.toJson());
//        }


//        Bson filter = Filters.exists("job");
//        Bson update = Updates.set("child", "Nevada Musk");
//        personelCollection.updateOne(filter,update);

//        Bson deleteFilter = Filters.eq("country", "England");
//        personelCollection.deleteMany(deleteFilter);

//        personelCollection.drop();

        infoDB.drop();


    }
}
