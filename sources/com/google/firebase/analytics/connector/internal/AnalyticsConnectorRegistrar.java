package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.b.d;
import com.google.firebase.components.b;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.f.g;
import java.util.Arrays;
import java.util.List;

public class AnalyticsConnectorRegistrar implements h {
    static {
        Covode.recordClassIndex(33698);
    }

    @Override // com.google.firebase.components.h
    public List<b<?>> getComponents() {
        return Arrays.asList(b.a(a.class).a(n.a(com.google.firebase.b.class)).a(n.a(Context.class)).a(n.a(d.class)).a(b.f54279a).a(2).a(), g.a("fire-analytics", "17.4.4"));
    }
}
