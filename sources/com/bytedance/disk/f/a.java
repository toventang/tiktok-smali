package com.bytedance.disk.f;

import android.net.Uri;
import android.provider.BaseColumns;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f28579a = Uri.parse("content://com.bytedance.disk:migration");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f28580b = {"mig_opt_reason", "mig_opt_from", "mig_opt_to", "mig_opt_policy", "mig_event", "mig_opt_type"};

    /* renamed from: com.bytedance.disk.f.a$a  reason: collision with other inner class name */
    public static class C0612a implements BaseColumns {

        /* renamed from: a  reason: collision with root package name */
        public static final Uri f28581a = Uri.withAppendedPath(a.f28579a, "migration_items_table");

        static {
            Covode.recordClassIndex(16795);
        }
    }

    static {
        Covode.recordClassIndex(16794);
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f28582a = {"_id", "mig_opt_dir", "mig_opt_reason", "mig_opt_file_len", "mig_opt_from", "mig_opt_to", "mig_opt_policy", "mig_opt_type", "mig_event", "mig_event_time", "mig_event_elapsed", "mig_deleted"};

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f28583b = {"_id"};

        static {
            Covode.recordClassIndex(16796);
        }
    }
}
