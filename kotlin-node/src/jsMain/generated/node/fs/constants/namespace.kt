@file:JsModule("node:fs")
@file:JsQualifier("constants")

package node.fs.constants


// File Access Constants
/** Constant for fs.access(). File is visible to the calling process. */
external val F_OK: Double

/** Constant for fs.access(). File can be read by the calling process. */
external val R_OK: Double

/** Constant for fs.access(). File can be written by the calling process. */
external val W_OK: Double

/** Constant for fs.access(). File can be executed by the calling process. */
external val X_OK: Double

// File Copy Constants
/** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
external val COPYFILE_EXCL: Double

/**
 * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
 * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
 */
external val COPYFILE_FICLONE: Double

/**
 * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
 * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
 */
external val COPYFILE_FICLONE_FORCE: Double

// File Open Constants
/** Constant for fs.open(). Flag indicating to open a file for read-only access. */
external val O_RDONLY: Double

/** Constant for fs.open(). Flag indicating to open a file for write-only access. */
external val O_WRONLY: Double

/** Constant for fs.open(). Flag indicating to open a file for read-write access. */
external val O_RDWR: Double

/** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
external val O_CREAT: Double

/** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
external val O_EXCL: Double

/**
 * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
 * opening the path shall not cause that terminal to become the controlling terminal for the process
 * (if the process does not already have one).
 */
external val O_NOCTTY: Double

/** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
external val O_TRUNC: Double

/** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
external val O_APPEND: Double

/** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
external val O_DIRECTORY: Double

/**
 * constant for fs.open().
 * Flag indicating reading accesses to the file system will no longer result in
 * an update to the atime information associated with the file.
 * This flag is available on Linux operating systems only.
 */
external val O_NOATIME: Double

/** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
external val O_NOFOLLOW: Double

/** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
external val O_SYNC: Double

/** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
external val O_DSYNC: Double

/** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
external val O_SYMLINK: Double

/** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
external val O_DIRECT: Double

/** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
external val O_NONBLOCK: Double

// File Type Constants
/** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
external val S_IFMT: Double

/** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
external val S_IFREG: Double

/** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
external val S_IFDIR: Double

/** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
external val S_IFCHR: Double

/** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
external val S_IFBLK: Double

/** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
external val S_IFIFO: Double

/** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
external val S_IFLNK: Double

/** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
external val S_IFSOCK: Double

// File Mode Constants
/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
external val S_IRWXU: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
external val S_IRUSR: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
external val S_IWUSR: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
external val S_IXUSR: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
external val S_IRWXG: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
external val S_IRGRP: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
external val S_IWGRP: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
external val S_IXGRP: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
external val S_IRWXO: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
external val S_IROTH: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
external val S_IWOTH: Double

/** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
external val S_IXOTH: Double

/**
 * When set, a memory file mapping is used to access the file. This flag
 * is available on Windows operating systems only. On other operating systems,
 * this flag is ignored.
 */
external val UV_FS_O_FILEMAP: Double
