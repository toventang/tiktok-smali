package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

class bp extends X509Certificate {

    /* renamed from: a  reason: collision with root package name */
    private final X509Certificate f53143a;

    static {
        Covode.recordClassIndex(32824);
    }

    public bp(X509Certificate x509Certificate) {
        this.f53143a = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() {
        this.f53143a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) {
        this.f53143a.checkValidity(date);
    }

    public final int getBasicConstraints() {
        return this.f53143a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set<String> getCriticalExtensionOIDs() {
        return this.f53143a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return this.f53143a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f53143a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f53143a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f53143a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f53143a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set<String> getNonCriticalExtensionOIDs() {
        return this.f53143a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f53143a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f53143a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f53143a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f53143a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f53143a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f53143a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f53143a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f53143a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f53143a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f53143a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        return this.f53143a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f53143a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f53143a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f53143a.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) {
        this.f53143a.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) {
        this.f53143a.verify(publicKey, str);
    }
}
