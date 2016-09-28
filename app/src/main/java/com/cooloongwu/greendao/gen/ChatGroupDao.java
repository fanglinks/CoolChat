package com.cooloongwu.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.cooloongwu.coolchat.entity.ChatGroup;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "CHAT_GROUP".
 */
public class ChatGroupDao extends AbstractDao<ChatGroup, Long> {

    public static final String TABLENAME = "CHAT_GROUP";

    /**
     * Properties of entity ChatGroup.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property FromId = new Property(1, int.class, "fromId", false, "FROM_ID");
        public final static Property ToGroupId = new Property(2, int.class, "toGroupId", false, "TO_GROUP_ID");
        public final static Property FromName = new Property(3, String.class, "fromName", false, "FROM_NAME");
        public final static Property FromAvatar = new Property(4, String.class, "fromAvatar", false, "FROM_AVATAR");
        public final static Property Content = new Property(5, String.class, "content", false, "CONTENT");
        public final static Property ContentType = new Property(6, String.class, "contentType", false, "CONTENT_TYPE");
        public final static Property Time = new Property(7, String.class, "time", false, "TIME");
        public final static Property IsRead = new Property(8, boolean.class, "isRead", false, "IS_READ");
    }


    public ChatGroupDao(DaoConfig config) {
        super(config);
    }

    public ChatGroupDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHAT_GROUP\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"FROM_ID\" INTEGER NOT NULL ," + // 1: fromId
                "\"TO_GROUP_ID\" INTEGER NOT NULL ," + // 2: toGroupId
                "\"FROM_NAME\" TEXT," + // 3: fromName
                "\"FROM_AVATAR\" TEXT," + // 4: fromAvatar
                "\"CONTENT\" TEXT," + // 5: content
                "\"CONTENT_TYPE\" TEXT," + // 6: contentType
                "\"TIME\" TEXT," + // 7: time
                "\"IS_READ\" INTEGER NOT NULL );"); // 8: isRead
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHAT_GROUP\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ChatGroup entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getFromId());
        stmt.bindLong(3, entity.getToGroupId());

        String fromName = entity.getFromName();
        if (fromName != null) {
            stmt.bindString(4, fromName);
        }

        String fromAvatar = entity.getFromAvatar();
        if (fromAvatar != null) {
            stmt.bindString(5, fromAvatar);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(6, content);
        }
 
        String contentType = entity.getContentType();
        if (contentType != null) {
            stmt.bindString(7, contentType);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(8, time);
        }
        stmt.bindLong(9, entity.getIsRead() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ChatGroup entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getFromId());
        stmt.bindLong(3, entity.getToGroupId());

        String fromName = entity.getFromName();
        if (fromName != null) {
            stmt.bindString(4, fromName);
        }

        String fromAvatar = entity.getFromAvatar();
        if (fromAvatar != null) {
            stmt.bindString(5, fromAvatar);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(6, content);
        }
 
        String contentType = entity.getContentType();
        if (contentType != null) {
            stmt.bindString(7, contentType);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(8, time);
        }
        stmt.bindLong(9, entity.getIsRead() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ChatGroup readEntity(Cursor cursor, int offset) {
        ChatGroup entity = new ChatGroup( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.getInt(offset + 1), // fromId
                cursor.getInt(offset + 2), // toGroupId
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // fromName
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // fromAvatar
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // content
                cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // contentType
                cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // time
                cursor.getShort(offset + 8) != 0 // isRead
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ChatGroup entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFromId(cursor.getInt(offset + 1));
        entity.setToGroupId(cursor.getInt(offset + 2));
        entity.setFromName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFromAvatar(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setContent(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContentType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTime(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setIsRead(cursor.getShort(offset + 8) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ChatGroup entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ChatGroup entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ChatGroup entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
