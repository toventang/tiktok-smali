package com.ss.android.ugc.aweme.tools.draft.h;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.draft.j;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.draft.model.f;
import com.ss.android.ugc.aweme.port.internal.e;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.utils.gr;
import h.f.b.l;
import org.json.JSONObject;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f139789a = new a((byte) 0);

    static {
        Covode.recordClassIndex(91371);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91372);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.e
    public final void a(boolean z, Exception exc) {
        String str = null;
        if (z) {
            q.a("draft_list_load_fail_rate", 0, (JSONObject) null);
            return;
        }
        ar arVar = new ar();
        if (exc != null) {
            str = exc.getMessage();
        }
        q.a("draft_list_load_fail_rate", 1, arVar.a("exception", str).a());
    }

    @Override // com.ss.android.ugc.aweme.port.internal.e
    public final void a(SQLiteDatabase sQLiteDatabase) {
        l.d(sQLiteDatabase, "");
        l.d(sQLiteDatabase, "");
        sQLiteDatabase.getPath();
        long currentTimeMillis = System.currentTimeMillis();
        b.a().storeLong("short_creation_time", currentTimeMillis);
        b.a(new a("db_create", 0, 0, b.b(), currentTimeMillis, b.a(currentTimeMillis, "UTC"), 6));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.e
    public final void b(SQLiteDatabase sQLiteDatabase) {
        l.d(sQLiteDatabase, "");
        l.d(sQLiteDatabase, "");
        b.a("draft db corruption deleted, path: " + sQLiteDatabase.getPath(), false);
        long currentTimeMillis = System.currentTimeMillis();
        b.a(new a("db_corruption_deleted", 0, 0, b.b(), currentTimeMillis, b.a(currentTimeMillis, "UTC"), 6));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.e
    public final void a(DraftLoadResult draftLoadResult) {
        l.d(draftLoadResult, "");
        int i2 = !draftLoadResult.isSuc();
        q.a("aweme_draft_load_fail_rate", i2, new ar().a(f.a(draftLoadResult)).a());
        com.ss.android.ugc.aweme.draft.f.a("DraftLoad", draftLoadResult.toString());
        if (!draftLoadResult.isSuc()) {
            q.a("aweme_draft_invalid", i2, new ar().a(f.a(draftLoadResult)).a());
        }
        int errorCode = draftLoadResult.getErrorCode();
        if (errorCode == 0) {
            gr.b("draft_load_success");
        } else {
            gr.a("draft_load_error", String.valueOf(errorCode), (String) null, (String) null, 12);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.e
    public final void a(DraftSaveResult draftSaveResult) {
        l.d(draftSaveResult, "");
        q.a("aweme_draft_create_fail_rate", !draftSaveResult.isSuc(), new ar().a(f.a(draftSaveResult)).a());
        com.ss.android.ugc.aweme.draft.f.a("DraftSave", draftSaveResult.toString());
        int errorCode = draftSaveResult.getErrorCode();
        if (errorCode == 0) {
            gr.b("draft_save_success");
        } else {
            gr.a("draft_save_error", String.valueOf(errorCode), (String) null, (String) null, 12);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.e
    public final void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        l.d(sQLiteDatabase, "");
        l.d(sQLiteDatabase, "");
        sQLiteDatabase.getPath();
        long currentTimeMillis = System.currentTimeMillis();
        b.a(new a("db_downgrade", i2, i3, b.b(), currentTimeMillis, b.a(currentTimeMillis, "UTC")));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.e
    public final void b(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        l.d(sQLiteDatabase, "");
        l.d(sQLiteDatabase, "");
        sQLiteDatabase.getPath();
        long currentTimeMillis = System.currentTimeMillis();
        b.a(new a("db_upgrade", i2, i3, b.b(), currentTimeMillis, b.a(currentTimeMillis, "UTC")));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.e
    public final void a(int i2, String str, com.ss.android.ugc.aweme.draft.model.c cVar) {
        String d2;
        String str2 = "";
        l.d(str, str2);
        l.d(cVar, str2);
        k.a("[monitorDraftUpdate]: status = " + i2 + "  errorMsg = " + str + "  errorCode = -1 creation id = " + cVar.f());
        if (i2 == -1) {
            d2 = str2;
        } else {
            d2 = d.d(cVar);
            if (i2 != -1) {
                str2 = d.e(cVar);
            }
        }
        q.a("aweme_draft_update_fail_rate", i2, new ar().a("creative_id", cVar.f()).a("videoPath", d2).a("fail_reason", str).a("code", (Integer) -1).a("copy_video_path", str2).a("creative_id", cVar.f()).a("save_draft_time", j.a(cVar.I, "UTC")).a());
    }

    @Override // com.ss.android.ugc.aweme.port.internal.e
    public final void a(String str, int i2, com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(str, "");
        l.d(cVar, "");
        int hashCode = str.hashCode();
        if (hashCode != 58226776) {
            if (hashCode == 1919799316 && str.equals("user_click")) {
                if (i2 <= 0) {
                    gr.a("draft_delete_error", "-400", (String) null, (String) null, 12);
                } else {
                    gr.b("draft_delete_success");
                }
                b.a("monitor draft delete: source=" + str + ", primaryKey=" + cVar.r(), true);
            }
        } else if (str.equals("publish_auto_trigger")) {
            b.a("monitor draft delete: source=" + str + ", primaryKey=" + cVar.r(), true);
        }
    }
}
