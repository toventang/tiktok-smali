package androidx.room;

import android.database.Cursor;
import androidx.i.a.b;
import androidx.i.a.c;
import androidx.room.j;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l extends c.a {

    /* renamed from: b  reason: collision with root package name */
    private a f4346b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4347c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4348d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4349e;

    static {
        Covode.recordClassIndex(1678);
    }

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4350a;

        static {
            Covode.recordClassIndex(1679);
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: protected */
        public abstract void a(b bVar);

        /* access modifiers changed from: protected */
        public abstract void b(b bVar);

        /* access modifiers changed from: protected */
        public abstract void c(b bVar);

        /* access modifiers changed from: protected */
        public abstract void d(b bVar);

        /* access modifiers changed from: protected */
        public void e(b bVar) {
        }

        public a(int i2) {
            this.f4350a = i2;
        }
    }

    private static void d(b bVar) {
        bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private void c(b bVar) {
        d(bVar);
        bVar.c(k.a(this.f4348d));
    }

    @Override // androidx.i.a.c.a
    public final void a(b bVar) {
        c(bVar);
        this.f4347c.b(bVar);
        this.f4347c.a();
    }

    private static boolean e(b bVar) {
        Cursor b2 = bVar.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (b2.moveToFirst() && b2.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b2.close();
        }
    }

    @Override // androidx.i.a.c.a
    public final void b(b bVar) {
        String str;
        super.b(bVar);
        if (e(bVar)) {
            Cursor a2 = bVar.a(new androidx.i.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (byte) 0));
            try {
                if (a2.moveToFirst()) {
                    str = a2.getString(0);
                } else {
                    str = null;
                }
            } finally {
                a2.close();
            }
        } else {
            str = null;
        }
        if (this.f4348d.equals(str) || this.f4349e.equals(str)) {
            this.f4347c.c(bVar);
            this.f4346b = null;
            return;
        }
        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
    }

    @Override // androidx.i.a.c.a
    public final void b(b bVar, int i2, int i3) {
        a(bVar, i2, i3);
    }

    @Override // androidx.i.a.c.a
    public final void a(b bVar, int i2, int i3) {
        boolean z;
        List<androidx.room.a.a> a2;
        a aVar = this.f4346b;
        if (aVar != null) {
            j.d dVar = aVar.f4237d;
            if (i2 == i3) {
                a2 = Collections.emptyList();
            } else {
                if (i3 > i2) {
                    z = true;
                } else {
                    z = false;
                }
                a2 = dVar.a(new ArrayList(), z, i2, i3);
            }
            if (a2 != null) {
                this.f4347c.e(bVar);
                for (androidx.room.a.a aVar2 : a2) {
                    aVar2.a(bVar);
                }
                this.f4347c.d(bVar);
                c(bVar);
                return;
            }
        }
        a aVar3 = this.f4346b;
        if (aVar3 == null || ((i2 <= i3 || !aVar3.f4245l) && aVar3.f4244k && (aVar3.f4246m == null || !aVar3.f4246m.contains(Integer.valueOf(i2))))) {
            throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f4347c.a(bVar);
        this.f4347c.b(bVar);
    }

    public l(a aVar, a aVar2, String str, String str2) {
        super(aVar2.f4350a);
        this.f4346b = aVar;
        this.f4347c = aVar2;
        this.f4348d = str;
        this.f4349e = str2;
    }
}
