$x = 0; 
    sub program1 {
    return $x;  
}
    sub staticScope {

    my $x = 1; 
    return program1(); 
}

print staticScope(),"\n ";


$y = 0; 
    sub program2 { 
    return $y; 
}
    sub dynamicScope {

    local $y = 1; 
    return program2(); 
}

print dynamicScope();