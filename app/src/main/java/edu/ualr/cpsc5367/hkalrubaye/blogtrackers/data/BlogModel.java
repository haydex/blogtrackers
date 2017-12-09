package edu.ualr.cpsc5367.hkalrubaye.blogtrackers.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by haydex on 12/8/17.
 */

public class BlogModel {


    public static final ArrayList<BlogItem> BLOGS = new ArrayList<BlogItem>();


    public static final Map<String, BlogItem> BLOGS_MAP = new HashMap<String, BlogItem>();

    private static final int COUNT = 40;

    /* Static with no name method , runs when the class is loaded and before it is constructed: https://stackoverflow.com/questions/1836227/java-no-name-static-method */
    static {

        for (int i = 1; i <= COUNT; i++) {
            addItem(createBlogItem(i));
        }
    }

    private static void addItem(BlogItem item) {
        BLOGS.add(item);
        BLOGS_MAP.put(item.ID, item);
    }

    private static BlogItem createBlogItem(int position) {
        return new BlogItem(String.valueOf(position), "Blog number " + position, "Details about blog number " + position);
    }

    public static class BlogItem {
        public final String ID;
        public final String TITLE;
        public final String DETAILS;

        public BlogItem(String id, String title, String details) {
            ID = id;
            TITLE = title;
            DETAILS = details;
        }

        @Override
        public String toString() {
            return TITLE;
        }
    }
}

