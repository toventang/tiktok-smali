package com.ss.android.ugc.aweme.comment.services;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.ss.android.ugc.aweme.comment.f.d;
import com.ss.android.ugc.aweme.comment.g.c;
import com.ss.android.ugc.aweme.comment.i.b;
import com.ss.android.ugc.aweme.comment.i.h;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import h.z;
import java.util.List;
import org.json.JSONObject;

public interface CommentService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72352a = a.f72353a;

    static {
        Covode.recordClassIndex(44612);
    }

    LiveData<Aweme> a(i iVar);

    CommentViewModel a(e eVar);

    com.ss.android.ugc.aweme.comment.e.a a(View view, androidx.fragment.app.i iVar, String str, a aVar, c cVar);

    d a(Activity activity, Aweme aweme, h hVar);

    s a(Aweme aweme);

    com.ss.android.ugc.aweme.o.c a(b bVar);

    List<TextExtraStruct> a(Context context, Aweme aweme, s sVar);

    List<TextExtraStruct> a(s sVar);

    List<TextExtraStruct> a(s sVar, AwemeRawAd awemeRawAd, h.f.a.a<z> aVar);

    void a();

    void a(Activity activity, String str, String str2, String str3, int i2);

    void a(Context context, int i2, String str);

    void a(Context context, QaStruct qaStruct, String str, String str2, String str3);

    void a(Context context, String str, Aweme aweme, int i2, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback);

    void a(e eVar, Aweme aweme, String str, String str2);

    void a(e eVar, boolean z, h.f.a.a<z> aVar);

    void a(androidx.fragment.app.i iVar, CommentRethinkPopup commentRethinkPopup, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3, String str);

    void a(String str);

    void a(String str, Aweme aweme, JSONObject jSONObject, String str2);

    void a(String str, Integer num, int i2, String str2, String str3);

    void a(String str, String str2);

    boolean a(Context context);

    com.ss.android.ugc.aweme.comment.api.e b(e eVar);

    com.ss.android.ugc.aweme.comment.e.a b(View view, androidx.fragment.app.i iVar, String str, a aVar, c cVar);

    String b(s sVar);

    String b(String str);

    void b();

    void b(Context context);

    boolean b(Aweme aweme);

    w c();

    void c(Context context);

    boolean c(Aweme aweme);

    boolean d();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f72353a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(44613);
        }
    }
}
