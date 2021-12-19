package com.ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell;
import com.ss.android.ugc.aweme.social.widget.card.permission.c;
import h.f.b.l;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f133831b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final PermissionCell<? extends c> f133832a;

    static {
        Covode.recordClassIndex(87552);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87553);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(PermissionCell<? extends c> permissionCell, View view) {
        super(view);
        l.d(permissionCell, "");
        l.d(view, "");
        this.f133832a = permissionCell;
    }
}
