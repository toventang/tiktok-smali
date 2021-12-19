package com.ss.android.ugc.aweme.comment.ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;

public final class bx extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f72643b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public PlayerController f72644a;

    /* renamed from: c  reason: collision with root package name */
    private Comment f72645c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f72646d;

    static {
        Covode.recordClassIndex(44751);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44752);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static bx a(Comment comment) {
            bx bxVar = new bx();
            Bundle bundle = new Bundle();
            bundle.putSerializable(UGCMonitor.EVENT_COMMENT, comment);
            bxVar.setArguments(bundle);
            return bxVar;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f72646d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.live.alphaplayer.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bx f72647a;

        static {
            Covode.recordClassIndex(44753);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.a
        public final void a(int i2, int i3, a.d dVar) {
            l.d(dVar, "");
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.a
        public final void b() {
            PlayerController playerController = this.f72647a.f72644a;
            if (playerController == null) {
                l.b();
            }
            playerController.a(8);
            this.f72647a.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(bx bxVar) {
            this.f72647a = bxVar;
        }
    }

    public final void a() {
        i supportFragmentManager;
        Fragment a2;
        e activity;
        i supportFragmentManager2;
        e activity2 = getActivity();
        if (activity2 != null && (supportFragmentManager = activity2.getSupportFragmentManager()) != null && (a2 = supportFragmentManager.a("GiftAnimationFragment")) != null && (activity = getActivity()) != null && (supportFragmentManager2 = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager2.a().a(a2).b();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window3 = dialog.getWindow();
            if (window3 == null) {
                l.b();
            }
            window3.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                l.b();
            }
            Serializable serializable = arguments.getSerializable(UGCMonitor.EVENT_COMMENT);
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.model.Comment");
            this.f72645c = (Comment) serializable;
        }
    }

    @Override // androidx.fragment.app.d
    public final void show(i iVar, String str) {
        super.show(iVar, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012c A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0193  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.bx.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        setCancelable(false);
        return com.a.a(layoutInflater, R.layout.ij, viewGroup, false);
    }
}
