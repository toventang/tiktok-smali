package com.ss.android.ugc.aweme.services.publish;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;

public final class ExtensionDataRepo extends ac {
    private a<z> addStarAtlasTag = ExtensionDataRepo$addStarAtlasTag$1.INSTANCE;
    private final t<Boolean> anchorExtension;
    private final t<Boolean> anchorState;
    private final t<Boolean> couponExtension;
    private final t<Boolean> gameExtension;
    private final t<Boolean> goodsExtension;
    private final t<Boolean> goodsState;
    private final t<Boolean> i18nPrivacy;
    private final t<Boolean> i18nShopExtension;
    private final t<Boolean> i18nStarAtlasClosed;
    private IPermissionAction iPermissionAction;
    private final t<Boolean> isGoodsAdd;
    private final t<Boolean> mediumExtension;
    private final t<Boolean> microAppExtension;
    private final t<Boolean> movieExtension;
    private final t<Boolean> postExtension;
    private a<z> removeStarAtlasTag = ExtensionDataRepo$removeStarAtlasTag$1.INSTANCE;
    private a<z> resetAnchor = ExtensionDataRepo$resetAnchor$1.INSTANCE;
    private a<z> resetGoodsAction = ExtensionDataRepo$resetGoodsAction$1.INSTANCE;
    private b<? super String, z> restoreGoodsPublishModel = ExtensionDataRepo$restoreGoodsPublishModel$1.INSTANCE;
    private final t<Boolean> seedingExtension;
    private b<? super Integer, Boolean> showPermissionAction;
    private final t<Boolean> starAtlasState;
    private t<com.ss.android.ugc.aweme.common.a> updateAnchor = new t<>();
    private t<List<com.ss.android.ugc.aweme.common.a>> updateAnchors = new t<>();
    private final t<Boolean> wikiExtension;
    private t<String> zipUrl = new t<>();

    static {
        Covode.recordClassIndex(79761);
    }

    public final a<z> getAddStarAtlasTag() {
        return this.addStarAtlasTag;
    }

    public final t<Boolean> getAnchorExtension() {
        return this.anchorExtension;
    }

    public final t<Boolean> getAnchorState() {
        return this.anchorState;
    }

    public final t<Boolean> getCouponExtension() {
        return this.couponExtension;
    }

    public final t<Boolean> getGameExtension() {
        return this.gameExtension;
    }

    public final t<Boolean> getGoodsExtension() {
        return this.goodsExtension;
    }

    public final t<Boolean> getGoodsState() {
        return this.goodsState;
    }

    public final t<Boolean> getI18nPrivacy() {
        return this.i18nPrivacy;
    }

    public final t<Boolean> getI18nShopExtension() {
        return this.i18nShopExtension;
    }

    public final t<Boolean> getI18nStarAtlasClosed() {
        return this.i18nStarAtlasClosed;
    }

    public final IPermissionAction getIPermissionAction() {
        return this.iPermissionAction;
    }

    public final t<Boolean> getMediumExtension() {
        return this.mediumExtension;
    }

    public final t<Boolean> getMicroAppExtension() {
        return this.microAppExtension;
    }

    public final t<Boolean> getMovieExtension() {
        return this.movieExtension;
    }

    public final t<Boolean> getPostExtension() {
        return this.postExtension;
    }

    public final a<z> getRemoveStarAtlasTag() {
        return this.removeStarAtlasTag;
    }

    public final a<z> getResetAnchor() {
        return this.resetAnchor;
    }

    public final a<z> getResetGoodsAction() {
        return this.resetGoodsAction;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, h.z>, h.f.a.b<java.lang.String, h.z> */
    public final b<String, z> getRestoreGoodsPublishModel() {
        return this.restoreGoodsPublishModel;
    }

    public final t<Boolean> getSeedingExtension() {
        return this.seedingExtension;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Integer, java.lang.Boolean>, h.f.a.b<java.lang.Integer, java.lang.Boolean> */
    public final b<Integer, Boolean> getShowPermissionAction() {
        return this.showPermissionAction;
    }

    public final t<Boolean> getStarAtlasState() {
        return this.starAtlasState;
    }

    public final t<com.ss.android.ugc.aweme.common.a> getUpdateAnchor() {
        return this.updateAnchor;
    }

    public final t<List<com.ss.android.ugc.aweme.common.a>> getUpdateAnchors() {
        return this.updateAnchors;
    }

    public final t<Boolean> getWikiExtension() {
        return this.wikiExtension;
    }

    public final t<String> getZipUrl() {
        return this.zipUrl;
    }

    public final t<Boolean> isGoodsAdd() {
        return this.isGoodsAdd;
    }

    public ExtensionDataRepo() {
        t<Boolean> tVar = new t<>();
        tVar.setValue(false);
        this.isGoodsAdd = tVar;
        t<Boolean> tVar2 = new t<>();
        tVar2.setValue(true);
        this.i18nPrivacy = tVar2;
        t<Boolean> tVar3 = new t<>();
        tVar3.setValue(true);
        this.i18nStarAtlasClosed = tVar3;
        t<Boolean> tVar4 = new t<>();
        tVar4.setValue(true);
        this.starAtlasState = tVar4;
        t<Boolean> tVar5 = new t<>();
        tVar5.setValue(true);
        this.goodsState = tVar5;
        t<Boolean> tVar6 = new t<>();
        tVar6.setValue(true);
        this.anchorState = tVar6;
        t<Boolean> tVar7 = new t<>();
        tVar7.setValue(false);
        this.movieExtension = tVar7;
        t<Boolean> tVar8 = new t<>();
        tVar8.setValue(false);
        this.postExtension = tVar8;
        t<Boolean> tVar9 = new t<>();
        tVar9.setValue(false);
        this.seedingExtension = tVar9;
        t<Boolean> tVar10 = new t<>();
        tVar10.setValue(false);
        this.goodsExtension = tVar10;
        t<Boolean> tVar11 = new t<>();
        tVar11.setValue(false);
        this.i18nShopExtension = tVar11;
        t<Boolean> tVar12 = new t<>();
        tVar12.setValue(false);
        this.wikiExtension = tVar12;
        t<Boolean> tVar13 = new t<>();
        tVar13.setValue(false);
        this.gameExtension = tVar13;
        t<Boolean> tVar14 = new t<>();
        tVar14.setValue(false);
        this.anchorExtension = tVar14;
        t<Boolean> tVar15 = new t<>();
        tVar15.setValue(false);
        this.couponExtension = tVar15;
        t<Boolean> tVar16 = new t<>();
        tVar16.setValue(false);
        this.mediumExtension = tVar16;
        t<Boolean> tVar17 = new t<>();
        tVar17.setValue(false);
        this.microAppExtension = tVar17;
    }

    public final void setIPermissionAction(IPermissionAction iPermissionAction2) {
        this.iPermissionAction = iPermissionAction2;
    }

    public final void setShowPermissionAction(b<? super Integer, Boolean> bVar) {
        this.showPermissionAction = bVar;
    }

    public final void setAddStarAtlasTag(a<z> aVar) {
        l.d(aVar, "");
        this.addStarAtlasTag = aVar;
    }

    public final void setRemoveStarAtlasTag(a<z> aVar) {
        l.d(aVar, "");
        this.removeStarAtlasTag = aVar;
    }

    public final void setResetAnchor(a<z> aVar) {
        l.d(aVar, "");
        this.resetAnchor = aVar;
    }

    public final void setResetGoodsAction(a<z> aVar) {
        l.d(aVar, "");
        this.resetGoodsAction = aVar;
    }

    public final void setRestoreGoodsPublishModel(b<? super String, z> bVar) {
        l.d(bVar, "");
        this.restoreGoodsPublishModel = bVar;
    }

    public final void setUpdateAnchor(t<com.ss.android.ugc.aweme.common.a> tVar) {
        l.d(tVar, "");
        this.updateAnchor = tVar;
    }

    public final void setUpdateAnchors(t<List<com.ss.android.ugc.aweme.common.a>> tVar) {
        l.d(tVar, "");
        this.updateAnchors = tVar;
    }

    public final void setZipUrl(t<String> tVar) {
        l.d(tVar, "");
        this.zipUrl = tVar;
    }
}
