package com.ss.android.ugc.aweme.kids.choosemusic.c;

import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.choosemusic.g.c;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

public abstract class a extends com.ss.android.ugc.aweme.base.f.a implements View.OnClickListener, TextView.OnEditorActionListener, i.c, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public t f105505a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f105506b;

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.ugc.aweme.kids.choosemusic.h.i f105507c;

    /* renamed from: d  reason: collision with root package name */
    public View f105508d;

    /* renamed from: e  reason: collision with root package name */
    TextView f105509e;

    /* renamed from: j  reason: collision with root package name */
    View f105510j;

    /* renamed from: k  reason: collision with root package name */
    boolean f105511k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f105512l;

    /* renamed from: m  reason: collision with root package name */
    protected WeakHandler f105513m = new WeakHandler(this);
    TextWatcher n = new TextWatcher() {
        /* class com.ss.android.ugc.aweme.kids.choosemusic.c.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(67601);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    };
    private int o;
    private String p;
    private Music q;
    private String r;
    private String s;
    private boolean t;
    private MusicModel u;
    private String v;
    private String w;

    static {
        Covode.recordClassIndex(67598);
    }

    @Override // androidx.fragment.app.i.c
    public final void a() {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f105513m.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getChildFragmentManager().b(this);
        super.onDestroyView();
    }

    public void onClick(View view) {
        e activity;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.f6k) {
            this.f105506b = false;
            this.f105507c.f105682b.setVisibility(0);
        } else if (view.getId() != R.id.dp3 && view.getId() == R.id.qb && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.o = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.p = getArguments().getString("challenge");
            this.v = getArguments().getString("creation_id");
            this.w = getArguments().getString("shoot_way");
            this.q = (Music) getArguments().getSerializable("sticker_music");
            this.r = getArguments().getString("first_sticker_music_ids", null);
            this.t = getArguments().getBoolean("is_busi_sticker", false);
            this.s = getArguments().getString("first_sticker_id", null);
            this.u = (MusicModel) getArguments().getSerializable("music_model");
            this.f105511k = getArguments().getBoolean("music_allow_clear", false);
            this.f105512l = getArguments().getBoolean("music_is_photomv", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        i childFragmentManager = getChildFragmentManager();
        Fragment a2 = childFragmentManager.a(R.id.ae8);
        if (a2 != null) {
            this.f105505a = (t) a2;
        } else {
            int i2 = this.o;
            String str = this.p;
            Music music = this.q;
            String str2 = this.r;
            String str3 = this.s;
            boolean z = this.t;
            String str4 = this.w;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            if (!TextUtils.isEmpty(str)) {
                bundle2.putString("challenge", str);
            }
            if (music != null) {
                bundle2.putSerializable("sticker_music", music);
            }
            if (str2 != null) {
                bundle2.putString("first_sticker_music_ids", str2);
            }
            if (str3 != null) {
                bundle2.putString("first_sticker_id", str3);
            }
            bundle2.putBoolean("is_busi_sticker", z);
            t tVar = new t();
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putString("shoot_way", str4);
            }
            tVar.setArguments(bundle2);
            this.f105505a = tVar;
            tVar.n = 0;
            MusicModel musicModel = this.u;
            if (musicModel != null && musicModel.isMvThemeMusic()) {
                this.f105505a.t = true;
            }
            this.f105505a.u = this.f105512l;
            n a3 = childFragmentManager.a();
            a3.a(R.id.ae8, this.f105505a);
            a3.c();
        }
        if (this.f105511k) {
            this.f105508d = view.findViewById(R.id.a1u);
            this.f105509e = (TextView) view.findViewById(R.id.ahg);
            this.f105510j = view.findViewById(R.id.a1v);
        }
        getChildFragmentManager().a((i.c) this);
        com.ss.android.ugc.aweme.kids.choosemusic.h.i iVar = this.f105507c;
        iVar.f105683c.setOnClickListener(iVar.f105681a);
        iVar.f105681a.f105505a.f105540a = new o() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.h.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67681);
            }
        };
        iVar.f105681a.f105505a.f105540a = new o() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.h.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(67682);
            }
        };
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.a(layoutInflater, R.layout.adk, viewGroup, false);
        c.f105652d = this.w;
        c.f105651c = this.v;
        this.f105507c = new com.ss.android.ugc.aweme.kids.choosemusic.h.i(a2, this, this.o, this.n);
        return a2;
    }
}
