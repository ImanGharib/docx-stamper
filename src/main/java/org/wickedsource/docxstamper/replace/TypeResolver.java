package org.wickedsource.docxstamper.replace;

import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

public interface TypeResolver {

    Object resolve(WordprocessingMLPackage document, Object expressionResult);

}