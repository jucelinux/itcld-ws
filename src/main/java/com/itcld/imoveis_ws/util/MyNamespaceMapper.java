package com.itcld.imoveis_ws.util;

import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;

public class MyNamespaceMapper extends NamespacePrefixMapper {

  private static final String DEF_PREFIX = ""; // DEFAULT NAMESPACE
  private static final String I123_URI = "http://itcld.com/imoveis-ws/schema/123i";
  private static final String DEF_URI = "http://itcld.com/imoveis-ws/schema/123i";


  @Override
  public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
      if(I123_URI.equals(namespaceUri)) {
          return null;
      }else if(I123_URI.equals(namespaceUri)) {
          return DEF_PREFIX;
      }
      return suggestion;
  }

  @Override
  public String[] getPreDeclaredNamespaceUris() {
      return new String[] { I123_URI, DEF_URI };
  }

}
