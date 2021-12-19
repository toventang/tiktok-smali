package com.facebook.imagepipeline.k;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.o.b;
import java.util.Map;

public class a implements c {
    static {
        Covode.recordClassIndex(29023);
    }

    @Override // com.facebook.imagepipeline.n.an
    public void onProducerEvent(String str, String str2, String str3) {
    }

    @Override // com.facebook.imagepipeline.n.an
    public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.n.an
    public void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.n.an
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.n.an
    public void onProducerStart(String str, String str2) {
    }

    @Override // com.facebook.imagepipeline.k.c
    public void onRequestCancellation(String str) {
    }

    @Override // com.facebook.imagepipeline.k.c
    public void onRequestFailure(b bVar, String str, Throwable th, boolean z) {
    }

    @Override // com.facebook.imagepipeline.k.c
    public void onRequestStart(b bVar, Object obj, String str, boolean z) {
    }

    @Override // com.facebook.imagepipeline.k.c
    public void onRequestSuccess(b bVar, String str, boolean z) {
    }

    @Override // com.facebook.imagepipeline.n.an
    public void onUltimateProducerReached(String str, String str2, boolean z) {
    }

    @Override // com.facebook.imagepipeline.n.an
    public boolean requiresExtraMap(String str) {
        return false;
    }
}
