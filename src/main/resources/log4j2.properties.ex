status=warn
# Set root logger level to DEBUG and appender to file
rootLogger.level=trace
rootLogger.appenderRef.file.ref=file
# Define the file appender
appender.file.type=File
appender.file.name=file
appender.file.fileName=app.log
appender.file.layout.type=PatternLayout
appender.file.layout.pattern=%d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n
# Add appender to root logger
rootLogger.appenderRefs=file

