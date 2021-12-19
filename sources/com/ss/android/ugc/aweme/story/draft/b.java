package com.ss.android.ugc.aweme.story.draft;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.tools.draft.ai;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class b implements com.ss.android.ugc.aweme.story.a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f137027a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h.h f137028b = i.a((h.f.a.a) f.f137032a);

    /* renamed from: c  reason: collision with root package name */
    private static final h.h f137029c = i.a((h.f.a.a) h.f137033a);

    /* renamed from: d  reason: collision with root package name */
    private static final h.h f137030d = i.a((h.f.a.a) e.f137031a);

    public static boolean a() {
        return ((Boolean) f137028b.getValue()).booleanValue();
    }

    public static SQLiteDatabase b() {
        return (SQLiteDatabase) f137029c.getValue();
    }

    public static SQLiteDatabase c() {
        return (SQLiteDatabase) f137030d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.a
    public final void b(SQLiteDatabase sQLiteDatabase) {
        l.d(sQLiteDatabase, "");
    }

    private b() {
    }

    @Override // com.ss.android.ugc.aweme.story.a
    public final void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        l.d(sQLiteDatabase, "");
        if (i2 <= 22 && i2 != i3) {
            c(sQLiteDatabase);
        }
    }

    static final class e extends m implements h.f.a.a<SQLiteDatabase> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f137031a = new e();

        static {
            Covode.recordClassIndex(89584);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SQLiteDatabase invoke() {
            com.ss.android.ugc.aweme.tools.draft.b.d a2 = com.ss.android.ugc.aweme.tools.draft.b.d.a();
            l.b(a2, "");
            return a2.getReadableDatabase();
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f137032a = new f();

        static {
            Covode.recordClassIndex(89585);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.story.base.a.a.a());
        }
    }

    static final class h extends m implements h.f.a.a<SQLiteDatabase> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f137033a = new h();

        static {
            Covode.recordClassIndex(89587);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SQLiteDatabase invoke() {
            com.ss.android.ugc.aweme.tools.draft.b.d a2 = com.ss.android.ugc.aweme.tools.draft.b.d.a();
            l.b(a2, "");
            return a2.getWritableDatabase();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<Integer> {
        final /* synthetic */ String $primaryKey;

        static {
            Covode.recordClassIndex(89580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.$primaryKey = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            MethodCollector.i(1852);
            b.b().beginTransaction();
            int delete = b.b().delete("local_story_draft", "_draft_session_id = ?", new String[]{this.$primaryKey});
            b.b().setTransactionSuccessful();
            b.b().endTransaction();
            Integer valueOf = Integer.valueOf(delete);
            MethodCollector.o(1852);
            return valueOf;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.b$b  reason: collision with other inner class name */
    static final class C3586b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ ContentValues $contentValues;

        static {
            Covode.recordClassIndex(89581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3586b(ContentValues contentValues) {
            super(0);
            this.$contentValues = contentValues;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            long replaceOrThrow = b.b().replaceOrThrow("local_story_draft", null, this.$contentValues);
            StringBuilder sb = new StringBuilder("StoryDraftDBHelper:insertDraft with result:");
            boolean z2 = true;
            if (replaceOrThrow > 0) {
                z = true;
            } else {
                z = false;
            }
            q.a(sb.append(z).toString());
            if (replaceOrThrow <= 0) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.draft.model.c> {
        final /* synthetic */ String $query;

        static {
            Covode.recordClassIndex(89582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.$query = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public com.ss.android.ugc.aweme.draft.model.c invoke() {
            com.ss.android.ugc.aweme.draft.model.c cVar;
            MethodCollector.i(1837);
            Cursor rawQuery = b.c().rawQuery(this.$query, null);
            try {
                Cursor cursor = rawQuery;
                l.b(cursor, "");
                if (cursor.getCount() > 0) {
                    cursor.moveToNext();
                    cVar = b.a(cursor);
                } else {
                    cVar = null;
                }
                h.e.c.a(rawQuery, null);
                MethodCollector.o(1837);
                return cVar;
            } catch (Throwable th) {
                h.e.c.a(rawQuery, th);
                MethodCollector.o(1837);
                throw th;
            }
        }
    }

    public static final class g extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ ContentValues $contentValues;
        final /* synthetic */ String $primaryKey;

        static {
            Covode.recordClassIndex(89586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ContentValues contentValues, String str) {
            super(0);
            this.$contentValues = contentValues;
            this.$primaryKey = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            MethodCollector.i(1461);
            b.b().update("local_story_draft", this.$contentValues, "_draft_session_id = ?", new String[]{this.$primaryKey});
            MethodCollector.o(1461);
            return true;
        }
    }

    static {
        Covode.recordClassIndex(89579);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ List $draftList;
        final /* synthetic */ h.f.a.b $filter;

        static {
            Covode.recordClassIndex(89583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h.f.a.b bVar, List list) {
            super(0);
            this.$filter = bVar;
            this.$draftList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MethodCollector.i(1503);
            Cursor rawQuery = b.c().rawQuery("select * from '" + ("local_story_draft' where user_id = '" + com.ss.android.ugc.aweme.port.in.g.a().A().c() + "' or user_id is null order by save_time asc"), null);
            try {
                Cursor cursor = rawQuery;
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        while (cursor.moveToNext()) {
                            com.ss.android.ugc.aweme.draft.model.c a2 = b.a(cursor);
                            if (((Boolean) this.$filter.invoke(a2)).booleanValue()) {
                                this.$draftList.add(a2);
                            }
                        }
                    }
                }
                h.e.c.a(rawQuery, null);
                z zVar = z.f158842a;
                MethodCollector.o(1503);
                return zVar;
            } catch (Throwable th) {
                h.e.c.a(rawQuery, th);
                MethodCollector.o(1503);
                throw th;
            }
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(2030);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `local_story_draft` (\n            `_draft_session_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n            `aweme`\tTEXT NOT NULL,\n            `music_path`\tTEXT,\n            `video_volume`\tINTEGER NOT NULL,\n            `music_volume`\tINTEGER NOT NULL,\n            `filter`\tINTEGER NOT NULL,\n            `music`\tTEXT,\n            `music_start`\tINTEGER NOT NULL,\n            `time`  LONG NOT NULL,\n            `save_time`  LONG NOT NULL,\n            `origin`    INTEGER,\n            `user_id`\tTEXT,\n            `segment_video`\tTEXT,\n            `sticker_id`\tTEXT,\n            `music_id`\tTEXT,\n            `effect_list`\tTEXT,\n            `camera_poi`\tINTEGER,\n            `filter_label`\tTEXT,\n            `is_private`\tINTEGER,\n            `max_duration`\tINTEGER,\n            `custom_cover_start`\tFLOAT,\n            `draft_extras`\tTEXT,\n            `last_output_path`\tTEXT\n        );");
        MethodCollector.o(2030);
    }

    public static com.ss.android.ugc.aweme.draft.model.c a(String str) {
        l.d(str, "");
        if (!a()) {
            return null;
        }
        return (com.ss.android.ugc.aweme.draft.model.c) a((Object) null, new c("select * from local_story_draft where _draft_session_id = '" + str + '\''));
    }

    public static List<com.ss.android.ugc.aweme.draft.model.c> a(h.f.a.b<? super com.ss.android.ugc.aweme.draft.model.c, Boolean> bVar) {
        l.d(bVar, "");
        if (!a()) {
            return h.a.z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        a(z.f158842a, new d(bVar, arrayList));
        q.a("StoryDraftDBHelper:queryDraftList success, result size:" + arrayList.size());
        return arrayList;
    }

    public static com.ss.android.ugc.aweme.draft.model.c a(Cursor cursor) {
        float f2;
        com.ss.android.ugc.aweme.draft.model.c cVar = new com.ss.android.ugc.aweme.draft.model.c();
        cVar.f83184e = a.c(cursor, "_draft_session_id");
        cVar.f83181b = ai.b(a.c(cursor, "aweme"));
        cVar.f83187h = a.c(cursor, "music_path");
        cVar.f83189j = a.a(cursor, "video_volume");
        cVar.f83190k = a.a(cursor, "music_volume");
        a(cVar, a.a(cursor, "filter"));
        cVar.f83185f = ai.c(a.c(cursor, "music"));
        cVar.n = a.a(cursor, "music_start");
        cVar.I = a.b(cursor, "time");
        cVar.J = a.b(cursor, "save_time");
        cVar.p = a.a(cursor, "origin");
        cVar.H = a.c(cursor, "user_id");
        cVar.K = a.c(cursor, "segment_video");
        cVar.O = a.c(cursor, "sticker_id");
        cVar.E = ai.d(a.c(cursor, "effect_list"));
        cVar.v = a.a(cursor, "camera_poi");
        cVar.u = a.c(cursor, "filter_label");
        cVar.D = a.a(cursor, "is_private");
        cVar.F = (long) a.a(cursor, "max_duration");
        l.d(cursor, "");
        l.d("custom_cover_start", "");
        int columnIndex = cursor.getColumnIndex("custom_cover_start");
        if (columnIndex >= 0) {
            f2 = cursor.getFloat(columnIndex);
        } else {
            f2 = 0.0f;
        }
        cVar.S = f2;
        try {
            cVar.a((com.ss.android.ugc.aweme.draft.model.b) com.ss.android.ugc.aweme.port.in.g.a().G().a(a.c(cursor, "draft_extras"), com.ss.android.ugc.aweme.draft.model.b.class));
            cVar.W.bF = a.c(cursor, "last_output_path");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.ss.android.ugc.aweme.port.in.g.a().c();
        cVar.R = 3;
        return cVar;
    }

    public static boolean a(com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        String a2 = com.ss.android.ugc.aweme.draft.model.d.a(cVar);
        l.d(a2, "");
        if (a() && a2.length() != 0) {
            int intValue = ((Number) a((Object) -1, (h.f.a.a) new a(a2))).intValue();
            q.a("StoryDraftDBHelper:deleteDraft with result:" + intValue + ",key:" + a2);
            if (intValue != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        l.d(sQLiteDatabase, "");
        c(sQLiteDatabase);
    }

    public static <T> T a(T t, h.f.a.a<? extends T> aVar) {
        try {
            t = (T) aVar.invoke();
            return t;
        } catch (Exception e2) {
            e2.printStackTrace();
            return t;
        }
    }

    public static void a(com.ss.android.ugc.aweme.draft.model.c cVar, int i2) {
        l.d(cVar, "");
        cVar.f83192m = i2;
        cVar.t(com.ss.android.ugc.aweme.port.in.c.C.a("story-filter").c().a(i2).getFilterFolder());
    }
}
