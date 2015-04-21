<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" indent="yes"/>
	<xsl:template match="/">
	<html>
	<head>
	</head>
	<body>
		<ol>
		<xsl:for-each select="sites/site">
			<li>
				<xsl:value-of select="@Name"/>	
				<xsl:text>, </xsl:text>
				<xsl:value-of select="@Latitude"/>
				<xsl:value-of select="@longitude"/>
			</li>
		</xsl:for-each>
		</ol>
	</body>
	</html>
	</xsl:template>
</xsl:stylesheet>