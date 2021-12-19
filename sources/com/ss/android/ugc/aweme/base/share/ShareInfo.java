package com.ss.android.ugc.aweme.base.share;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class ShareInfo implements Serializable {
    @c(a = "bool_persist")
    public int boolPersist;
    @c(a = "manage_goods_url")
    public String goodsManagerUrl;
    @c(a = "goods_rec_url")
    public String goodsRecUrl;
    @c(a = "share_image_url")
    public UrlModel imageUrls;
    @c(a = "share_qrcode_url")
    public UrlModel qrCodeUrls;
    @c(a = "share_desc")
    public String shareDesc;
    @c(a = "share_desc_info")
    public String shareDescInfo;
    @c(a = "share_link_desc")
    public String shareLinkDesc;
    @c(a = "share_quote")
    public String shareQuote;
    @c(a = "share_signature_desc")
    public String shareSignatureDesc;
    @c(a = "share_signature_url")
    public String shareSignatureUrl;
    @c(a = "share_title")
    public String shareTitle;
    @c(a = "share_title_myself")
    public String shareTitleMyself;
    @c(a = "share_title_other")
    public String shareTitleOther;
    @c(a = "share_toutiao_desc")
    public String shareToutiaoDesc;
    @c(a = "share_url")
    public String shareUrl;
    @c(a = "whatsapp_desc")
    public String whatsappShareDesc;

    static {
        Covode.recordClassIndex(42038);
    }

    public int getBoolPersist() {
        return this.boolPersist;
    }

    public String getGoodsManagerUrl() {
        return this.goodsManagerUrl;
    }

    public String getGoodsRecUrl() {
        return this.goodsRecUrl;
    }

    public UrlModel getImageUrls() {
        return this.imageUrls;
    }

    public UrlModel getQrCodeUrls() {
        return this.qrCodeUrls;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public String getShareDescInfo() {
        return this.shareDescInfo;
    }

    public String getShareLinkDesc() {
        return this.shareLinkDesc;
    }

    public String getShareQuote() {
        return this.shareQuote;
    }

    public String getShareSignatureDesc() {
        return this.shareSignatureDesc;
    }

    public String getShareSignatureUrl() {
        return this.shareSignatureUrl;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareTitleMyself() {
        return this.shareTitleMyself;
    }

    public String getShareTitleOther() {
        return this.shareTitleOther;
    }

    public String getShareToutiaoDesc() {
        return this.shareToutiaoDesc;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getWhatsappShareDesc() {
        return this.whatsappShareDesc;
    }

    public void setBoolPersist(int i2) {
        this.boolPersist = i2;
    }

    public void setGoodsManagerUrl(String str) {
        this.goodsManagerUrl = str;
    }

    public void setGoodsRecUrl(String str) {
        this.goodsRecUrl = str;
    }

    public void setImageUrls(UrlModel urlModel) {
        this.imageUrls = urlModel;
    }

    public void setQrCodeUrls(UrlModel urlModel) {
        this.qrCodeUrls = urlModel;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareDescInfo(String str) {
        this.shareDescInfo = str;
    }

    public void setShareLinkDesc(String str) {
        this.shareLinkDesc = str;
    }

    public void setShareQuote(String str) {
        this.shareQuote = str;
    }

    public void setShareSignatureDesc(String str) {
        this.shareSignatureDesc = str;
    }

    public void setShareSignatureUrl(String str) {
        this.shareSignatureUrl = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareTitleOther(String str) {
        this.shareTitleOther = str;
    }

    public void setShareToutiaoDesc(String str) {
        this.shareToutiaoDesc = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setWhatsappShareDesc(String str) {
        this.whatsappShareDesc = str;
    }

    public void setShareTitleMyself(String str) {
        this.shareTitleMyself = this.shareTitleMyself;
    }
}
