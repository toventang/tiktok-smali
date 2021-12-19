package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.a;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f;
import com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class b extends d implements View.OnClickListener, a.b, a.c {

    /* renamed from: h  reason: collision with root package name */
    public static final a f100988h = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public String f100989e;

    /* renamed from: f  reason: collision with root package name */
    public ai f100990f;

    /* renamed from: g  reason: collision with root package name */
    public String f100991g;

    /* renamed from: i  reason: collision with root package name */
    private final h f100992i = i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f100993j;

    static {
        Covode.recordClassIndex(64596);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f100993j == null) {
            this.f100993j = new HashMap();
        }
        View view = (View) this.f100993j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f100993j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        HashMap hashMap = this.f100993j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final ChatViewModel c() {
        return (ChatViewModel) this.f100992i.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64597);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<ChatViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ChatViewModel invoke() {
            return ChatViewModel.a.a(this.this$0);
        }
    }

    private final void d() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.dla);
        l.b(tuxTextView, "");
        tuxTextView.setText("");
        b("");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.a.b
    public final void a() {
        if (f.a(this)) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.dla);
            l.b(tuxTextView, "");
            CharSequence text = tuxTextView.getText();
            if (text != null) {
                c().a(text, this.f100989e);
                d();
            }
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100995a;

        static {
            Covode.recordClassIndex(64599);
        }

        c(b bVar) {
            this.f100995a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            T t;
            com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a) obj;
            if ((aVar instanceof a.d) && (t = ((a.d) aVar).f102463a) != null) {
                this.f100995a.f100990f = t;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.a.c
    public final void a(String str) {
        if (f.a(this) && str != null) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.dla);
            l.b(tuxTextView, "");
            tuxTextView.setText(str);
            b(str);
        }
    }

    private void a(boolean z) {
        if (f.a(this)) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.dla);
            l.b(tuxTextView, "");
            CharSequence hint = tuxTextView.getHint();
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.dla);
            l.b(tuxTextView2, "");
            CharSequence text = tuxTextView2.getText();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("hint", hint);
            bundle.putCharSequence("text", text);
            bundle.putBoolean("showEmojiPanel", z);
            androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
            l.b(childFragmentManager, "");
            a a2 = a.C2507a.a(childFragmentManager);
            a2.setArguments(bundle);
            a2.a((a.c) this);
            a2.a((a.b) this);
            if (a2.isAdded()) {
                com.ss.android.ugc.aweme.im.service.m.a.a("ReplyKeyboardDialogFragment", "Fragment is already added");
            } else {
                a2.show(getChildFragmentManager(), "ReplyKeyboardDialogFragment");
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (!f.a(this) || com.ss.android.ugc.aweme.l.a.a.a(view, 500)) {
            return;
        }
        if (l.a(view, a(R.id.dyu))) {
            a();
        } else if (l.a(view, a(R.id.dla))) {
            a(false);
        } else if (l.a(view, a(R.id.avj))) {
            a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.b$b  reason: collision with other inner class name */
    static final class C2508b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100994a;

        static {
            Covode.recordClassIndex(64598);
        }

        C2508b(b bVar) {
            this.f100994a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            e activity;
            e activity2;
            if (obj instanceof a.d) {
                b bVar = this.f100994a;
                if (f.a(bVar) && (activity2 = bVar.getActivity()) != null) {
                    l.b(activity2, "");
                    new com.bytedance.tux.g.b(activity2).e(R.string.hj).b(R.raw.icon_tick_fill_small).d(R.attr.aw).b();
                }
            } else if (obj instanceof a.C2572a) {
                int i2 = this.f100994a.c().f101493b;
                if (i2 == 1) {
                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.e.a(this.f100994a.getActivity());
                } else if (i2 == 2) {
                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.e.b(this.f100994a.getActivity());
                } else if (i2 == 3) {
                    b bVar2 = this.f100994a;
                    if (f.a(bVar2) && (activity = bVar2.getActivity()) != null) {
                        l.b(activity, "");
                        new com.bytedance.tux.g.b(activity).e(R.string.hk).b(R.raw.icon_x_mark_small).d(R.attr.av).b();
                    }
                }
            }
        }
    }

    private final void b(String str) {
        int i2;
        int i3;
        boolean z;
        int length = str.length() - 1;
        int i4 = 0;
        boolean z2 = false;
        while (i4 <= length) {
            if (!z2) {
                i3 = i4;
            } else {
                i3 = length;
            }
            if (l.a(str.charAt(i3), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                if (!z) {
                    break;
                }
                length--;
            } else if (!z) {
                z2 = true;
            } else {
                i4++;
            }
        }
        boolean z3 = !TextUtils.isEmpty(str.subSequence(i4, length + 1).toString());
        TuxIconView tuxIconView = (TuxIconView) a(R.id.dyu);
        l.b(tuxIconView, "");
        boolean isActivated = tuxIconView.isActivated();
        TuxIconView tuxIconView2 = (TuxIconView) a(R.id.dyu);
        l.b(tuxIconView2, "");
        tuxIconView2.setActivated(z3);
        TuxIconView tuxIconView3 = (TuxIconView) a(R.id.dyu);
        l.b(tuxIconView3, "");
        tuxIconView3.setEnabled(z3);
        TuxIconView tuxIconView4 = (TuxIconView) a(R.id.dyu);
        if (z3) {
            i2 = R.attr.ay;
        } else {
            i2 = R.attr.ad;
        }
        tuxIconView4.setTintColorRes(i2);
        if (z3 && !isActivated) {
            TuxIconView tuxIconView5 = (TuxIconView) a(R.id.dyu);
            l.b(tuxIconView5, "");
            com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.b.a(tuxIconView5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b4, code lost:
        if (r6 != null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a4x, viewGroup, false);
    }
}
