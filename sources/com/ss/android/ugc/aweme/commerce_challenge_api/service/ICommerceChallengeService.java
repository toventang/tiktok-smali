package com.ss.android.ugc.aweme.commerce_challenge_api.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce_challenge_api.c.a;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.LinkedHashMap;

public interface ICommerceChallengeService {
    static {
        Covode.recordClassIndex(45250);
    }

    UrlModel a(String str, boolean z, boolean z2);

    a a();

    Aweme a(Aweme aweme);

    void a(int i2);

    void a(Uri uri, String str);

    void a(TextView textView, Aweme aweme, SpannableString spannableString, String str);

    void a(com.ss.android.ugc.aweme.commerce_challenge_api.a.a aVar);

    void a(Challenge challenge);

    void a(TextExtraStruct textExtraStruct);

    void a(MentionTextView mentionTextView, Aweme aweme, String str);

    void a(String str);

    void a(String str, String str2);

    boolean a(Context context, String str, UrlModel urlModel, SpannableString spannableString, TextView textView, String str2);

    boolean a(Context context, String str, boolean z, TextView textView, boolean z2, String str2);

    void b();

    void b(String str, String str2);

    boolean b(Challenge challenge);

    boolean b(String str);

    LinkedHashMap<String, Bitmap> c();

    boolean c(Challenge challenge);

    boolean d();
}
