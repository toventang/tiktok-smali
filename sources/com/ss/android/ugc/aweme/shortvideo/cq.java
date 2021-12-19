package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.share.b;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.shortvideo.publish.h;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class cq extends Fragment implements View.OnClickListener, x<ai> {

    /* renamed from: a  reason: collision with root package name */
    protected CircularProgressView f125286a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f125287b;

    /* renamed from: c  reason: collision with root package name */
    public h f125288c;

    /* renamed from: d  reason: collision with root package name */
    public View f125289d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f125290e;

    /* renamed from: f  reason: collision with root package name */
    private int f125291f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f125292g;

    /* renamed from: h  reason: collision with root package name */
    private MainActivity f125293h;

    static {
        Covode.recordClassIndex(82267);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onParallelPublishCancel() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onParallelPublishPause() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onParallelPublishResume() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onSynthetiseSuccess(String str) {
    }

    public final void b() {
        requireFragmentManager().a().b(this).c();
    }

    public final void a() {
        requireFragmentManager().a().a(R.anim.ds, R.anim.dt).c(this).c();
    }

    public final void c() {
        if (getFragmentManager() != null) {
            getFragmentManager().a().a(this).c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (getActivity() != null) {
            a.C3244a.a(getActivity()).a("upload_progress_fragment", false);
        }
        c();
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onError(et etVar) {
        this.f125292g = false;
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            this.f125293h = (MainActivity) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            a.C3244a.a(getActivity()).a("upload_progress_fragment", true);
        }
    }

    private void a(int i2) {
        CircularProgressView circularProgressView = this.f125286a;
        if (circularProgressView != null) {
            circularProgressView.setProgress((float) i2);
            this.f125287b.setText(i2 + "%");
        }
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f125293h != null && this.f125288c != null) {
            r.a("click_publishing_toast", new d().a("creation_id", this.f125288c.e()).a("video_type", this.f125288c.b()).a("enter_from", this.f125293h.getEnterFrom()).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onProgressUpdate(int i2, boolean z) {
        this.f125291f = i2;
        a(i2);
        if (z && !this.f125292g) {
            this.f125292g = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CircularProgressView circularProgressView = (CircularProgressView) view.findViewById(R.id.byw);
        this.f125286a = circularProgressView;
        circularProgressView.setIndeterminate(false);
        this.f125287b = (TextView) view.findViewById(R.id.dby);
        View findViewById = view.findViewById(R.id.dqe);
        this.f125289d = findViewById;
        findViewById.setOnClickListener(this);
        if (getActivity() != null) {
            a.C3244a.a(getActivity()).a("upload_progress_fragment", true);
        }
        a(this.f125291f);
        if (this.f125293h != null && this.f125288c != null) {
            r.a("publishing_toast_show", new d().a("creation_id", this.f125288c.e()).a("video_type", this.f125288c.b()).a("enter_from", this.f125293h.getEnterFrom()).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onSuccess(ai aiVar, boolean z) {
        this.f125292g = false;
        if (aiVar instanceof CreateAwemeResponse) {
            b bVar = new b(this);
            Aweme aweme = ((CreateAwemeResponse) aiVar).aweme;
            if (!SharePrefCache.inst().getIsAwemePrivate().c().booleanValue()) {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (SharePrefCache.inst().getAutoSendTwitter().c().booleanValue()) {
                        arrayList.add(2);
                        jSONArray.put("twitter");
                    }
                    jSONObject.put("platform", jSONArray);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(",");
                }
                if (arrayList.size() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                r.onEvent(MobClick.obtain().setJsonObject(jSONObject).setEventName("sync_video").setLabelName("edit_page"));
                if (!TextUtils.isEmpty(sb)) {
                    bVar.f123371a.a(sb.toString(), aweme.getShareInfo().getShareUrl(), aweme.getShareInfo().getShareTitle(), SharePrefCache.inst().getFacebookAccessToken().c(), SharePrefCache.inst().getTwitterAccessToken().c(), SharePrefCache.inst().getTwitterSecret().c(), SharePrefCache.inst().getGoogleServerAuthCode().c(), aweme.getAid(), aweme.getShareInfo().getShareTitle(), "");
                }
                SharePrefCache.inst().getIsAwemePrivate().b(false);
            }
        }
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.a1f, viewGroup, false);
    }
}
