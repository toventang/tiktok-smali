package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.zhiliaoapp.musically.R;
import h.f.b.g;
import h.f.b.l;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class a extends Enum<a> {
    public static final a ADD_MEMBER;
    public static final a CREATE_GROUP;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ a[] f102695a;

    static {
        Covode.recordClassIndex(65761);
        b bVar = new b("CREATE_GROUP");
        CREATE_GROUP = bVar;
        C2586a aVar = new C2586a("ADD_MEMBER");
        ADD_MEMBER = aVar;
        f102695a = new a[]{bVar, aVar};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f102695a.clone();
    }

    public abstract boolean getShowJoinedGroupsHeader();

    public abstract String sendBtnText(int i2);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a$a  reason: collision with other inner class name */
    static final class C2586a extends a {
        private final boolean showJoinedGroupsHeader;

        static {
            Covode.recordClassIndex(65762);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a
        public final boolean getShowJoinedGroupsHeader() {
            return this.showJoinedGroupsHeader;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a$a$a  reason: collision with other inner class name */
        public static final class C2588a implements ImTextTitleBar.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2586a f102699a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.base.f.a f102700b;

            static {
                Covode.recordClassIndex(65763);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
            public final void c() {
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
            public final void a(int i2) {
                C2586a.a(this.f102700b);
            }

            C2588a(C2586a aVar, com.ss.android.ugc.aweme.base.f.a aVar2) {
                this.f102699a = aVar;
                this.f102700b = aVar2;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2586a(String str) {
            super(str, 1, null);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a
        public final String sendBtnText(int i2) {
            String string;
            if (i2 < 2) {
                string = a().getString(R.string.c8p);
            } else {
                string = a().getString(R.string.c8q, Integer.valueOf(i2));
            }
            l.b(string, "");
            return string;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a
        public final void setupTitleBar(ImTextTitleBar imTextTitleBar, com.ss.android.ugc.aweme.base.f.a aVar) {
            l.d(imTextTitleBar, "");
            l.d(aVar, "");
            a.super.setupTitleBar(imTextTitleBar, aVar);
            imTextTitleBar.setTitle(R.string.c6j);
            imTextTitleBar.setLeftText("");
            imTextTitleBar.setRightIcon(R.raw.icon_x_mark_small);
            imTextTitleBar.setOnTitlebarClickListener(new C2588a(this, aVar));
        }
    }

    static final class b extends a {
        private final boolean showJoinedGroupsHeader = true;

        static {
            Covode.recordClassIndex(65764);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a
        public final boolean getShowJoinedGroupsHeader() {
            return this.showJoinedGroupsHeader;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a$b$a  reason: collision with other inner class name */
        public static final class C2589a implements ImTextTitleBar.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f102704a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.base.f.a f102705b;

            static {
                Covode.recordClassIndex(65765);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
            public final void a(int i2) {
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
            public final void c() {
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
            public final void a() {
                b.a(this.f102705b);
            }

            C2589a(b bVar, com.ss.android.ugc.aweme.base.f.a aVar) {
                this.f102704a = bVar;
                this.f102705b = aVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(String str) {
            super(str, 0, null);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a
        public final String sendBtnText(int i2) {
            String string;
            if (i2 < 2) {
                string = a().getString(R.string.c8m);
            } else {
                string = a().getString(R.string.c8o, Integer.valueOf(i2));
            }
            l.b(string, "");
            return string;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a
        public final void setupTitleBar(ImTextTitleBar imTextTitleBar, com.ss.android.ugc.aweme.base.f.a aVar) {
            l.d(imTextTitleBar, "");
            l.d(aVar, "");
            a.super.setupTitleBar(imTextTitleBar, aVar);
            imTextTitleBar.setTitle(R.string.c7i);
            imTextTitleBar.setLeftText(R.string.cdh);
            imTextTitleBar.setOnTitlebarClickListener(new C2589a(this, aVar));
        }
    }

    protected static Context a() {
        return d.a();
    }

    protected static void a(com.ss.android.ugc.aweme.base.f.a aVar) {
        l.d(aVar, "");
        i fragmentManager = aVar.getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.a().a(aVar);
        }
        e activity = aVar.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    private a(String str, int i2) {
    }

    public void setupTitleBar(ImTextTitleBar imTextTitleBar, com.ss.android.ugc.aweme.base.f.a aVar) {
        l.d(imTextTitleBar, "");
        l.d(aVar, "");
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().setupStatusBar(aVar.getActivity());
    }

    public /* synthetic */ a(String str, int i2, g gVar) {
        this(str, i2);
    }
}
